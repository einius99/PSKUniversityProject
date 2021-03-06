package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Meal;

public interface MealMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int insert(Meal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    Meal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    List<Meal> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int updateByPrimaryKey(Meal record);
}