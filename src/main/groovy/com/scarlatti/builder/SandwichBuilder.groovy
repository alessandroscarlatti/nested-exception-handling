package com.scarlatti.builder

import com.scarlatti.model.Ingredient
import com.scarlatti.model.Sandwich

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/29/2018
 */
class SandwichBuilder {

    private Sandwich sandwich

    SandwichBuilder(Sandwich sandwich) {
        this.sandwich = sandwich
    }
/**
 * @return a string that represents the sandwich.  For example,
 * sandwich with ingredient lettuce with ingredient tomato with sandwich...etc.
 */
    String build() {
        StringBuilder string = new StringBuilder(" with sandwich")
        for (Ingredient ingredient : sandwich.ingredients) {
            IngredientBuilder ingredientBuilder = new IngredientBuilder(ingredient)
            string.append(ingredientBuilder.build())
        }

        return string.toString()
    }
}
