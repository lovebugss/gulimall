package com.itrjp.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.common.utils.Query;

import com.itrjp.gulimall.product.dao.CategoryDao;
import com.itrjp.gulimall.product.entity.CategoryEntity;
import com.itrjp.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> all = baseMapper.selectList(null);

        return all.stream()
                .filter(CategoryEntity::isParent)
                .peek(menu -> menu.setChildren(findChild(menu, all)))
                .sorted(Comparator.comparing(CategoryEntity::getSort,
                        Comparator.nullsFirst(Comparator.naturalOrder()))
                        .reversed())
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> findChild(CategoryEntity current, List<CategoryEntity> all) {
        return all.stream()
                .filter(menu -> current.getCatId().equals(menu.getParentCid()))
                .peek(menu -> menu.setChildren(findChild(menu, all)))
                .sorted(Comparator.comparing(CategoryEntity::getSort, Comparator.nullsFirst(Comparator.naturalOrder())).reversed())
                .collect(Collectors.toList());
    }

}