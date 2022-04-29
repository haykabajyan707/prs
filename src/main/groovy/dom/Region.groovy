package dom

import groovy.transform.CompileStatic
@CompileStatic
enum Region {

    ARAGATSOTN("Aragatsotn"),
    ARARAT("Ararat"),
    ARMAVIR("Armavir"),
    GEGHARKUNIK("Gegharkunik"),
    LORI("Lori"),
    KOTAYK("Kotayk"),
    SHIRAK("Shirak"),
    SYUNIK("Syunik"),
    TAVUSH("Tavush"),
    VAYOTS_DZOR("Vayots-dzor"),
    YEREVAN("Yerevan")

    String name


    Region(String name){
        this.name = name
    }

    String getName() {
        return name
    }
}