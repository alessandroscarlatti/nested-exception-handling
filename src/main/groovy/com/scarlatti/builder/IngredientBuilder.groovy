package com.scarlatti.builder

import com.scarlatti.model.Ingredient

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/29/2018
 */
class IngredientBuilder {
    private Ingredient ingredient

    IngredientBuilder(Ingredient ingredient) {
        this.ingredient = ingredient
    }

    String build() {
        return " with " + ingredient.name
    }
}
