//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun CalculateCaffeineLevel() {
    print("how many hours have you worked?\n")
    val HoursWorked = readln().toInt()

    print("How many bugs have you found?\n")
    val BugsFound = readln().toInt()

    print("What is your energy level?\n")
    val EnergyLevel = readln()

    var EnergyBonus =  when (EnergyLevel) {
        "tired" -> 5
        "awake" -> 0
        "zombie" -> 10
        else -> 0
    }

    var CaffieneLevelNum: Int = BugsFound * 2 + HoursWorked + EnergyBonus

    var CaffieneLevel: String = "none"

    if (CaffieneLevelNum in 0..5) {
        CaffieneLevel = "Light"
    }

    else if (CaffieneLevelNum in 6..10) {
        CaffieneLevel = "Medium"
    }

    else if (CaffieneLevelNum in 11..15) {
        CaffieneLevel = "Strong"
    }

    else if (CaffieneLevelNum >= 16) {
        CaffieneLevel = "Rocket Fuel"
    }

    else {
        CaffieneLevel = "Rocket Fuel"
    }

    print("The level of Caffiene you need is $CaffieneLevel!")
}

fun main() {
    CalculateCaffeineLevel()
}