package lt.vu.mybatis.model;

public class Meal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.MEAL.ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.MEAL.NAME
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.MEAL.TYPE
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.MEAL.RESTAURANT_ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    private Integer restaurantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.MEAL.ID
     *
     * @return the value of PUBLIC.MEAL.ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.MEAL.ID
     *
     * @param id the value for PUBLIC.MEAL.ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.MEAL.NAME
     *
     * @return the value of PUBLIC.MEAL.NAME
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.MEAL.NAME
     *
     * @param name the value for PUBLIC.MEAL.NAME
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.MEAL.TYPE
     *
     * @return the value of PUBLIC.MEAL.TYPE
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.MEAL.TYPE
     *
     * @param type the value for PUBLIC.MEAL.TYPE
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.MEAL.RESTAURANT_ID
     *
     * @return the value of PUBLIC.MEAL.RESTAURANT_ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.MEAL.RESTAURANT_ID
     *
     * @param restaurantId the value for PUBLIC.MEAL.RESTAURANT_ID
     *
     * @mbg.generated Mon Apr 13 23:20:18 EEST 2020
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
}