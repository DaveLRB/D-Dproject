package entities;

import entities.Monster;

public class MonsterFactory {
    public static Monster createMonster(MonsterType monsterType) {
        return switch (monsterType) {
            case SLIME ->
                    new Monster("Slime", 15, 100,true,false, new String[]{"Slap", "Bounce"}, new String[]{"I'm gooey!", "Bloop bloop!"});
            case BABYSPIDERS ->
                    new Monster("Baby Spider", 20, 100,true, false, new String[]{"Bite", "Web Spit"}, new String[]{"Tiny hisses", "Skittering sounds"});
            case GOBLIN ->
                    new Monster("Goblin", 25, 100,true, false, new String[]{"Stab", "Throw Rock"}, new String[]{"You disturb our home!", "Grrr!"});
            case SKELETON ->
                    new Monster("Skeleton", 30, 100, true,false, new String[]{"Boner Attack", "Rattle"}, new String[]{"Click clack!", "Beware the bones!"});
            case ZOMBIE ->
                    new Monster("Zombie", 35, 100,true, false, new String[]{"Bite", "Grasp"}, new String[]{"Braaaains!", "Uuuuuh!"});
            case SPECTRE ->
                    new Monster("Spectre", 40, 100,true, false, new String[]{"Ethereal Touch", "Soul Drain"}, new String[]{"Haunting your dreams!", "Wandering spirit!"});
            case WEREWOLF ->
                    new Monster("Werewolf", 45, 100, true,false, new String[]{"Claw Slash", "Howl"}, new String[]{"Awooo!", "Night is my domain!"});
            case GHOST ->
                    new Monster("Ghost", 50, 100,true, false, new String[]{"Haunt", "Vanish"}, new String[]{"Boo!", "Can't touch me!"});
            case WITCH ->
                    new Monster("Witch", 55, 100, true,false, new String[]{"Spell Cast", "Potion Toss"}, new String[]{"Double, double, toil and trouble!", "You're in my hex!"});
            case VAMPIRE ->
                    new Monster("Vampire", 60, 100,true, false, new String[]{"Bite", "Hypnotize"}, new String[]{"I vant to suck your blood!", "Night is eternal!"});
            case MUMMY ->
                    new Monster("Mummy", 65, 100,true, false, new String[]{"Bandage Wrap", "Ancient Curse"}, new String[]{"Unwrapping the past!", "Eternal slumber disturbed!"});
            case CREEPER ->
                    new Monster("Creeper", 70, 100,true, false, new String[]{"Explode", "Sssss"}, new String[]{"Hiss!", "Sizzle sizzle!"});
            case HARPY ->
                    new Monster("Harpy", 75, 100, true,false, new String[]{"Talon Slash", "Wind Gust"}, new String[]{"Caw caw!", "Feathers in the wind!"});
            case CENTAUR ->
                    new Monster("Centaur", 80, 100, true,false, new String[]{"Bow Shot", "Hoof Kick"}, new String[]{"Half human, half horse!", "Galloping charge!"});
            case MINOTAUR ->
                    new Monster("Minotaur", 85, 100,true, false, new String[]{"Axe Swing", "Maze Charge"}, new String[]{"Roar!", "Lost in the labyrinth!"});
            case CYCLOPS ->
                    new Monster("Cyclops", 90, 100, true,false, new String[]{"Boulder Throw", "Single Eye Glare"}, new String[]{"One eye sees all!", "Thud!"});
            case BASILISK ->
                    new Monster("Basilisk", 95, 100, true,false, new String[]{"Petrify Gaze", "Venomous Bite"}, new String[]{"Hiss!", "Statue in your future!"});
            case GRIFFIN ->
                    new Monster("Griffin", 100, 100,true, false, new String[]{"Claw Swipe", "Wing Buffet"}, new String[]{"Screech!", "Feathers in the storm!"});
            case CHIMERA ->
                    new Monster("Chimera", 105, 100, true,false, new String[]{"Fire Breath", "Tail Whip"}, new String[]{"Roar!", "Three-headed terror!"});
            case MEDUSA ->
                    new Monster("Medusa", 110, 100, true,false, new String[]{"Snake Bite", "Stone Gaze"}, new String[]{"Serpent hiss!", "Petrifying stare!"});
            case WYVERN ->
                    new Monster("Wyvern", 115, 100,true, false, new String[]{"Tail Sweep", "Dive Bomb"}, new String[]{"Roar!", "Wings of fury!"});
            case PHOENIX ->
                    new Monster("Phoenix", 120, 100,true, false, new String[]{"Fire Burst", "Rebirth"}, new String[]{"Caw caw!", "Rising from ashes!"});
            case KRAKEN ->
                    new Monster("Kraken", 125, 100,true, false, new String[]{"Tentacle Grasp", "Ink Cloud"}, new String[]{"Gurgle!", "Deep-sea menace!"});
            case BEHEMOTH ->
                    new Monster("Behemoth", 130, 100,true, false, new String[]{"Earthquake Stomp", "Meteor Shower"}, new String[]{"Roar!", "Colossal power!"});
            case DRAGON ->
                    new Monster("Dragon", 150, 100,true, false, new String[]{"Dragon Breath", "Wing Gust"}, new String[]{"Roar!", "Wings of fire!"});
            default -> null;
        };
    }
}