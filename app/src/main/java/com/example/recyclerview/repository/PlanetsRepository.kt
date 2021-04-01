package com.example.recyclerview.repository

import com.example.recyclerview.model.Planet

object PlanetsRepository {

    fun getAllPlanets(): List<Planet> {
        return listOf(
                Planet("Mercury", "Mercury is the closest planet to the Sun and on average, all seven other planets.", "Mercury is 2.6x smaller than Earth.", "57,909,227 km"),
                Planet("Venus", "Venus is close in size to Earth and, like Earth, has a thick silicate mantle around an iron core.", "Venus is 1.1x smaller than Earth.", "108,209,475 km"),
                Planet("Earth", "Our home planet is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things.", "Volume: 6.73 x 1011 cubic miles (1.083 x 1012 km3)", "149,598,262 km"),
                Planet("Mars", "Mars is the fourth planet from the Sun – a dusty, cold, desert world with a very thin atmosphere.", "Mars is 1.9x smaller than Earth.", "227,943,824 km"),
                Planet("Jupiter", "Fifth in line from the Sun, Jupiter is, by far, the largest planet in the solar system.", "Jupiter is 11.0x larger than Earth.", "778,340,821 km"),
                Planet("Saturn", "Saturn is the sixth planet from the Sun and the second largest planet in our solar system.", "Saturn is 9.1x larger than Earth.", "1,426,666,422 km"),
                Planet("Uranus", "The first planet found with the aid of a telescope, Uranus was discovered in 1781 by astronomer William Herschel.", "Uranus is 4.0x larger than Earth.", "2,870,658,186 km"),
                Planet("Neptune", "Dark, cold and whipped by supersonic winds, ice giant Neptune is the eighth and most distant planet in our solar system.", "Neptune is 3.9x larger than Earth.", "4,498,396,441 km"),
                Planet("Pluto", "Pluto – which is smaller than Earth’s Moon – has a heart-shaped glacier that’s the size of Texas and Oklahoma.", "Pluto is 5.5x smaller than Earth.", "5,906,440,628 km"),
                Planet("Ceres", "Dwarf planet Ceres is the largest object in the asteroid belt between Mars and Jupiter and the only dwarf planet located in the inner solar system.", "Ceres is 13.4x smaller than Earth", "413,690,250 km"),
                Planet("Makemake", "Slightly smaller than Pluto, Makemake is the second-brightest object in the Kuiper Belt as seen from Earth (while Pluto is the brightest).", "Slightly smaller than Pluto.", "6,783,345,606 km"),
                Planet("Haumea", "Haumea is one of the fastest rotating large objects in our solar system. Its fast spin distorts Haumea's shape, making this dwarf planet look like a football.", "Roughly the same size as Pluto.", "6,432,011,461 km"),
                Planet("Eris", "Eris is one of the largest known dwarf planets in our solar system. It's about the same size as Pluto, but is three times farther from the Sun.", "Almost the size of Pluto.", "10,180,122,852 km")
        )
    }

}