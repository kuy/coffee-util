package net.endflow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equals.shouldBeEqual

class BrewRatioTest : FunSpec({
    context("testing forRatio") {
        test("should return BrewRatio") {
            val actual = BrewRatioFactory.forRatio(14.0, 238.0)
            actual.ratio shouldBeEqual 17.0
        }
    }

    context("testing forWater") {
        test("should return BrewRatio") {
            val actual = BrewRatioFactory.forWater(14.0, 17.0)
            actual.water shouldBeEqual 238.0
        }
    }

    context("testing forCoffee") {
        test("should return BrewRatio") {
            val actual = BrewRatioFactory.forCoffee(238.0, 17.0)
            actual.coffee shouldBeEqual 14.0
        }
    }
})
