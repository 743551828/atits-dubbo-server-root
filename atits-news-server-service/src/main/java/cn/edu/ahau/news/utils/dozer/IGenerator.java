package cn.edu.ahau.news.utils.dozer;

import java.util.List;
import java.util.Set;

/**
 * @author zhangys
 * @date 2020/4/30
 */
public interface IGenerator {

    /**
     * 单个对象的深度复制及类型转换，vo/domain , po
     *
     * @param s   数据对象
     * @param clz 复制目标类型
     * @return 复制后的目标对象
     */
    <T, S> T convert(S s, Class<T> clz);

    /**
     * list深度复制
     *
     * @param s   list对象
     * @param clz 复制目标类型
     * @return 复制后的目标list
     */
    <T, S> List<T> convert(List<S> s, Class<T> clz);

    /**
     * set深度复制
     *
     * @param s   set对象
     * @param clz 复制目标类型
     * @return 复制后的目标set
     */
    <T, S> Set<T> convert(Set<S> s, Class<T> clz);

    /**
     * 数组深度复制
     *
     * @param s   数组对象
     * @param clz 复制目标类型
     * @return 复制后的目标数组
     */
    <T, S> T[] convert(S[] s, Class<T> clz);




}
