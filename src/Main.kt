//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun CalculateCaffeineLevel() {
    print("how many hours have you worked?\n")
    val HoursWorked = readln().toInt();

    print("How many bugs have you found?\n")
    val BugsFound = readln().toInt();

    print("What is your energy level?\n")
    val EnergyLevel = readln();

    var EnergyBonus: Int = 0;

    if (EnergyLevel == "Tired") {
        EnergyBonus = 5
    }

    else if (EnergyLevel == "Awake") {
        EnergyBonus = 0
    }

    else if (EnergyLevel == "Zombie") {
        EnergyBonus = 10
    }

    else {
        EnergyBonus = 0
    }

    var CaffieneLevelNum: Int = BugsFound * 2 + HoursWorked + EnergyBonus;



    print("")

}

fun main() {
    CalculateCaffeineLevel()
}