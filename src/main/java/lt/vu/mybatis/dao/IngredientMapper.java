package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Ingredient;
import org.mybatis.cdi.Mapper;

@Mapper
public interface IngredientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int insert(Ingredient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    Ingredient selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    List<Ingredient> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INGREDIENT
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    int updateByPrimaryKey(Ingredient record);

    List<Ingredient> selectIngredientsByMeal(Integer mealId);
}