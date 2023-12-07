class MonsterFactory {
    public static Monster createMonster(MonsterType monsterType) {
        return switch (monsterType) {
            case SLIME -> new Monster("Slime", 15, 100, true, false, false, false,
                    new String[]{"Slap", "Bounce"},
                    new String[]{"Let's keep it slimey.","I'm gooey!", "Bloop bloop!"},
                    new String[]{"I'm not just a puddle of goo, you know!", "Prepare to be slimed!"},
                    new String[]{"Even slimes have feelings, you know?", "I'm feeling a bit...bubblie."});

            case BABYSPIDERS -> new Monster("Baby Spider", 20, 100, true, true, false, false,
                    new String[]{"Bite", "Web Spit"},
                    new String[]{"No need for arachnophobia; we can coexist.", "Skittering sounds", "Creeping up on you... quietly."},
                    new String[]{"My web is stronger than it looks!", "You're stuck in my trap now!"},
                    new String[]{"I may be small, but I'm venomous!", "Creeping up on you... shyly."});

            case GOBLIN -> new Monster("Goblin", 25, 100, true, false, false,false,
                    new String[]{"Stab", "Throw Rock"},
                    new String[]{"You disturb our home!", "Grrr!"},
                    new String[]{"This is goblin territory!", "Time to face the goblin wrath!"},
                    new String[]{"Goblins stick together! Get ready for trouble!", "You're in for a goblin surprise!"});

            case SKELETON -> new Monster("Skeleton", 30, 100, true, false, false,false,
                    new String[]{"Boner Attack", "Rattle"},
                    new String[]{"Click clack!", "Beware the bones!"},
                    new String[]{"You can't defeat what's already dead!", "Skeletons have the best bone-chilling jokes."},
                    new String[]{"I'm all bones, but I hit hard!", "Ready to dance with the bones?"});

            case ZOMBIE -> new Monster("Zombie", 35, 100, true, true, false,false,
                    new String[]{"Bite", "Grasp"},
                    new String[]{"Braaaains!", "Grr , i mean Uuuuuh!"},
                    new String[]{"I want your brains... and your heart!", "The undead hunger never ends!"},
                    new String[]{"I may be slow, but I'm persistent!", "Join the zombie horde!"});

            case SPECTRE -> new Monster("Spectre", 40, 100, true, false, false,false,
                    new String[]{"Ethereal Touch", "Soul Drain"},
                    new String[]{"Haunting your dreams!", "Wandering spirit!"},
                    new String[]{"I'm the whisper in the shadows!", "Your nightmares brought to life!"},
                    new String[]{"You can't escape the spectre's grasp!", "Your soul is my trophy!"});

            case WEREWOLF -> new Monster("Werewolf", 45, 100, true, false, false,false,
                    new String[]{"Claw Slash", "Howl"},
                    new String[]{"Awooo!", "Night is my domain!"},
                    new String[]{"The moon empowers me!", "Beware the fury of the werewolf!"},
                    new String[]{"Feel the love in the moonlight!", "My heart beats for you, my sweet."});

            case GHOST -> new Monster("Ghost", 50, 100,true,  false, false,false,
                    new String[]{"Haunt", "Vanish"},
                    new String[]{"Boo!", "Can't touch me!"},
                    new String[]{"In the realm between life and death, I am unstoppable!", "You cannot escape the ghost's presence."},
                    new String[]{"Your love warms my spectral heart!", "Feel the haunting beauty of our connection."});

            case WITCH -> new Monster("Witch", 55, 100, true, false, false,false,
                    new String[]{"Spell Cast", "Potion Toss"},
                    new String[]{"Double, double, toil and trouble!", "You're in my ass!"},
                    new String[]{"Magic flows through my veins!", "The witch's brew will seal your fate."},
                    new String[]{"Enchanted by your presence, my dear!", "A spell of love is cast upon us."});

            case VAMPIRE -> new Monster("Vampire", 60, 100,true,  true, false,false,
                    new String[]{"Bite", "Hypnotize"},
                    new String[]{"I vant to suck your blood!", "Night is eternal!"},
                    new String[]{"Beware the allure of the vampire!", "My bite is worse than my bark!"},
                    new String[]{"I thrive in the darkness, and so will you!", "Feel the embrace of the eternal night!"});

            case MUMMY -> new Monster("Mummy", 65, 100, true, false, false,false,
                    new String[]{"Bandage Wrap", "Ancient Curse"},
                    new String[]{"Unwrapping the past!", "Eternal slumber disturbed!"},
                    new String[]{"Ancient curses awaken!", "The mummy's wrath knows no bounds."},
                    new String[]{"Wrapped in the warmth of our love!", "Feel the eternity in the mummy's tomb."});

            case CREEPER -> new Monster("Creeper", 70, 100, true,  false, false,false,
                    new String[]{"Explode", "Sssss"},
                    new String[]{"Hiss!", "Sizzle sizzle!"},
                    new String[]{"Watch out for the creeper's explosion!", "I'm about to blow your mind... and everything else!"},
                    new String[]{"Creeping silently, until the big reveal!", "I'm the surprise in the shadows!"});

            case HARPY -> new Monster("Harpy", 75, 100,true,  false, false,false,
                    new String[]{"Talon Slash", "Wind Gust"},
                    new String[]{"Caw caw!", "Feathers in the wind!"},
                    new String[]{"High above, the harpy descends!", "The talons of the harpy know no mercy."},
                    new String[]{"Our love soars on the wings of my voice!", "Feel the tender breeze of our connection."});

            case CENTAUR -> new Monster("Centaur", 80, 100, true, false, false,false,
                    new String[]{"Bow Shot", "Hoof Kick"},
                    new String[]{"Half human, half horse!", "Galloping charge!"},
                    new String[]{"The centaur's bow strikes true!", "Trample beneath the hooves of the centaur."},
                    new String[]{"Swift as the wind, powerful as the storm!", "Our love gallops with the grace of a centaur."});

            case MINOTAUR -> new Monster("Minotaur", 85, 100, true, false, false,false,
                    new String[]{"Axe Swing", "Maze Charge"},
                    new String[]{"Roar!", "Lost in the labyrinth!"},
                    new String[]{"In the maze of my rage, you'll find no escape!", "Minotaur's fury unleashed!"},
                    new String[]{"My axe cleaves through the strongest armor!", "The minotaur's labyrinthine wrath is upon you!"});

            case CYCLOPS -> new Monster("Cyclops", 90, 100, true, false, false,false,
                    new String[]{"Boulder Throw", "Single Eye Glare"},
                    new String[]{"One eye sees all!", "Thud!"},
                    new String[]{"A boulder descends upon you!", "The cyclops glare pierces through!"},
                    new String[]{"Feel the tremor of love in the cyclops's stomp!", "Our connection is as colossal as the cyclops."});

            case BASILISK -> new Monster("Basilisk", 95, 100,true,  false, false,false,
                    new String[]{"Petrify Gaze", "Venomous Bite"},
                    new String[]{"Hiss!", "Statue in your future!"},
                    new String[]{"Basilisk's gaze turns flesh to stone!", "Feel the venomous bite of the serpent's kiss!"},
                    new String[]{"A stare that petrifies and a bite that paralyzes!", "You've entered the basilisk's domain, prepare for stony stillness!"});

            case GRIFFIN -> new Monster("Griffin", 100, 100, true, false, false,false,
                    new String[]{"Claw Swipe", "Wing Buffet"},
                    new String[]{"Screech!", "Feathers in the storm!"},
                    new String[]{"Griffin soars through the heavens, talons ready!", "Feel the might of the griffin's wings and claws!"},
                    new String[]{"Aerial onslaught from the king of mythical beasts!", "I'm the storm that sweeps you off your feet!"});

            case CHIMERA -> new Monster("Chimera", 105, 100, true, false, false,false,
                    new String[]{"Fire Breath", "Tail Whip"},
                    new String[]{"Roar!", "Three-headed terror!"},
                    new String[]{"Chimera breathes fire and whips with serpent's tail!", "Feel the wrath of the three-headed beast!"},
                    new String[]{"A fusion of flame, venom, and claws!", "Chimera's threefold attack is unstoppable!"});

            case MEDUSA -> new Monster("Medusa", 110, 100, true, false, false,false,
                    new String[]{"Snake Bite", "Stone Gaze"},
                    new String[]{"Serpent hiss!", "Petrifying stare!"},
                    new String[]{"Avoid the gaze or turn to stone!", "Feel the serpentine strike of Medusa."},
                    new String[]{"Our love petrifies the heart with joy!", "Gaze into my eyes and feel the love, not the stone."});

            case WYVERN -> new Monster("Wyvern", 115, 100, true, false, false,false,
                    new String[]{"Tail Sweep", "Dive Bomb"},
                    new String[]{"Roar!", "Wings of fury!"},
                    new String[]{"Wyvern's tail sweeps and wings buffet with furious might!", "Feel the wind from the wyvern's dive bomb!"},
                    new String[]{"I'm the winged terror of the skies!", "Dive-bombing wyvern, ready for the kill!"});

            case PHOENIX -> new Monster("Phoenix", 120, 100, true, false, false,false,
                    new String[]{"Fire Burst", "Rebirth"},
                    new String[]{"Caw caw!", "Rising from ashes!"},
                    new String[]{"Burning flames engulf you!", "Witness the rebirth of the phoenix."},
                    new String[]{"Our love rises from the ashes!", "Feel the warmth of our connection in my flame's embrace."});

            case KRAKEN -> new Monster("Kraken", 125, 100,true,  false, false,false,
                    new String[]{"Tentacle Grasp", "Ink Cloud"},
                    new String[]{"Gurgle!", "Deep-sea menace!"},
                    new String[]{"Kraken's tentacles grasp and ink clouds obscure!", "Feel the deep-sea menace of the legendary kraken!"},
                    new String[]{"Tentacles that ensnare, and ink that blinds!", "I'm the terror lurking in the abyss!"});

            case BEHEMOTH -> new Monster("Behemoth", 130, 100, true, false, false,false,
                    new String[]{"Earthquake Stomp", "Meteor Shower"},
                    new String[]{"Roar!", "Colossal power!"},
                    new String[]{"Behemoth's stomp causes earthquakes, and meteor shower descends!", "Feel the colossal power of the mighty behemoth!"},
                    new String[]{"Stomping the earth and showering meteors!", "Behemoth, the embodiment of colossal might!"});

            case DRAGON -> new Monster("Dragon", 150, 100,true,  false, false,false,
                    new String[]{"Dragon Breath", "Wing Gust"},
                    new String[]{"Roar!", "Wings of fire!"},
                    new String[]{"The dragon's breath engulfs all!", "Feel the gust of the dragon's wings."},
                    new String[]{"Our love roars with the fury of the dragon!", "Fly with me on the wings of eternal passion."});
        };
    }
}
