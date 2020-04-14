package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.MealIngredient;
import org.mybatis.cdi.Mapper;

@Mapper
public interface MealIngredientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL_INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int insert(MealIngredient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.MEAL_INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    List<MealIngredient> selectAll();
}