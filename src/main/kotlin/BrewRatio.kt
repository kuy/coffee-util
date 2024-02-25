package net.endflow

data class BrewRatio(
    val coffee: Double,
    val water: Double,
    val ratio: Double,
)

class BrewRatioFactory {
    companion object {
        fun forRatio(coffee: Double, water: Double): BrewRatio {
            val ratio = water / coffee
            return BrewRatio(coffee, water, ratio)
        }
    }
}
