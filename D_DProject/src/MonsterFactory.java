class MonsterFactory {
    public static Monster createMonster(MonsterType monsterType) {
        return switch (monsterType) {
            case SLIME -> new Monster("Slime", 15, 30, 15, 35, true, false, false, false,
                    new String[]{"Gelatinous Grasp", "Slime Splash", "Bouncy Bop", "Ooze Overture", "Squishy Slam"},
                    new String[]{"Let's keep it slimey.", "I'm gooey!", "Bloop bloop!",
                            "Feel the squish of my attacks!", "Prepare for a slimy surprise."},
                    new String[]{"I'm not just a puddle of goo, you know!", "I'm angry!",
                            "Get ready to be slimed!", "Gooey wrath coming!", "GLO GLO oohuuuh"},
                    new String[]{"Even slimes have feelings, you know?", "I'm feeling a bit...bubblieee.",
                            "Our connection is as gooey as love.", "I love our slimy bond.", "I'm gonna love the goo'out of you."});

            case BABYSPIDERS -> new Monster("Baby Spider", 20, 35, 15, 35, true, false, false, false,
                    new String[]{"Venomous Bite", "Web Spit", "Silk Wrap", "Arachnid Assault", "Spider Squeeze"},
                    new String[]{"No need to fear, we can coexist.", "Skittering sounds",
                            "Creeping up on you... quietly.", "Watch out, I'm quick!", "I have a venomous bite!"},
                    new String[]{"You've angered the arachnid!", "My patience is wearing thin!", "You can't escape my silk!",
                            "My web is a trap of fury!", "I'll weave your demise!"},
                    new String[]{"Captivated by spider charm.", "The silk of love binds us.", "You're tangled in my love's web.",
                            "Feel this delicate touch of mine", "In the web of love, we're entwined."});

            case GOBLIN -> new Monster("Goblin", 25, 40, 15, 35, true, false, false, false,
                    new String[]{"Vicious Stab", "Rock Throw", "Goblin Ambush", "Sneaky Strike", "Mischief Slash"},
                    new String[]{"You disturb my home!", "Grrr!", "Beware the goblin mischief!", "Goblins UNITE!", "What are you doing here?"},
                    new String[]{"This is goblin territory!", "Time to face the goblin wrath!", "You've angered the goblin horde!", "Prepare for goblin mayhem!", "Goblin rage is unleashed!"},
                    new String[]{"Captivated by goblin charm.", "I like shiny things, and mischief ;)", "Hope you don't resist me", "Feel the mischievous touch of goblin affection.", "Why fight... let's make a pleasurable arrangement?"});

            case SKELETON -> new Monster("Skeleton", 30, 45, 15, 35, true, false, false, false,
                    new String[]{"Boner Attack", "Rattle", "Bone Crush", "Spooky Strike", "Graveyard Slam"},
                    new String[]{"Click clack!", "Beware the bones!", "Skeletons arise!", "Rattling bones in the darkness.", "The undead march."},
                    new String[]{"You can't defeat what's already dead!", "Skeletons have the best bone-chilling jokes.", "Feel the chill of the grave!", "Bones of fury!", "Dance with the skeletons!"},
                    new String[]{"Enthralled by skeletal charm.", "Embrace the bone-chilling love.", "Caught in the dance of the undead.", "Feel the skeletal passion.", "In the arms of the skeletal embrace."});

            case ZOMBIE -> new Monster("Zombie", 35, 50, 15, 35, true, false, false, false,
                    new String[]{"Bite", "Grasp", "Lurch", "Flesh Tear", "Rotting Slam"},
                    new String[]{"Braaaains! The undead hunger.", "This is the thriller", "Graveyard whispers linger.", "Flesh Tear, a gruesome delight.", "Echoes of decay."},
                    new String[]{"The undead hunger never ends!", "Flesh is my favorite snack!", "Zombie rage!", "Rotting and restless!", "With your bodies I feast"},
                    new String[]{"Ensnared by the undead charm.", "Sleep in my cold embrace.", "I want your brains... and your heart!", "Feel the decaying love.", "Watch these moves. (;"});

            case SPECTRE -> new Monster("Spectre", 40, 55, 35, 55, true, true, false, false,
                    new String[]{"Ethereal Touch", "Soul Drain", "Shadow Strike", "Ghostly Wail", "Phantom Embrace"},
                    new String[]{"Haunting your dreams!", "Wandering spirit!", "Whispers in the dark.", "Ephemeral presence.", "Chilling."},
                    new String[]{"I'm the whisper in the shadows!", "Your nightmares brought to life!", "Fear the ethereal touch!", "Spectral wrath unleashed!", "Ghostly vengeance!"},
                    new String[]{"Enveloped in the spectral allure.", "Dancing with shadows.", "Embrace the ghostly love.", "By me, you will bewitched", "Soul entwined."});

            case WEREWOLF -> new Monster("Werewolf", 45, 60, 35, 55, true, false, false, false,
                    new String[]{"Claw Slash", "Howl", "Moonlit Pounce", "Feral Lunge", "Lunar Fury"},
                    new String[]{"Awooo!", "Night is my domain!", "Moonlit serenade.", "Prowling in the shadows.", "Wild and untamed."},
                    new String[]{"The moon empowers me!", "Beware the fury of the werewolf!", "Lunar wrath unleashed!", "Feel the feral rage!", "Embrace the moonlit savagery!"},
                    new String[]{"In the moonlight's tender embrace.", "My heart beats with the moon's rhythm.", "Feel the love in the moonlight!", "Wild love under the moon.", "Moonlit passion in every howl."});

            case GHOST -> new Monster("Ghost", 50, 65, 35, 55, true, true, false, false,
                    new String[]{"Haunt", "Vanish", "Ethereal Grasp", "Spectral Wail", "Ghostly Embrace"},
                    new String[]{"Boo!", "Can't touch me!", "Whispers in the shadows.", "Dancing in the ethereal realm.", "Ghostly echoes."},
                    new String[]{"In the realm between life and death, I am unstoppable!", "You cannot escape the ghost's grasp.", "Hunting the living with ethereal power!", "A ghosts vengeance is swift!", "Feel the ghostly wrath!"},
                    new String[]{"Your love warms my spectral heart!", "Eternally bound by ghostly affection.", "In the dance of the spirits, we unite.", "The haunting beauty of our connection.", "Love transcends even death."});

            case WITCH -> new Monster("Witch", 55, 70, 35, 55, true, false, false, false,
                    new String[]{"Spell Cast", "Potion Toss", "Enchanting Hex", "Mystic Blast", "Witch's Embrace"},
                    new String[]{"Double, double, toil and trouble!", "You're in my hex!", "Whispers of ancient incantations.", "Potion bubbling in the cauldron.", "Mystical energies surround us."},
                    new String[]{"Magic flows through my veins!", "The witch's brew will seal your fate.", "Hexes and curses!", "Feel the magical wrath of a witch", "Doomed by the mystic forces!"},
                    new String[]{"Enchanted by your presence, my dear!", "A spell of love is cast upon us.", "In the dance of enchantment, we are entwined.", "Feel the magical embrace of love.", "Our love is a potion of eternal bliss."});

            case VAMPIRE -> new Monster("Vampire", 60, 75, 35, 55, true, false, false, false,
                    new String[]{"Bite", "Hypnotize", "Night's Embrace", "Dark Kiss", "Eternal Thirst"},
                    new String[]{"I vant to suck your blood!", "Night is eternal!", "Whispers of the nocturnal creatures.", "Moonlight glimmers", "Bats herald my nocturnal presence."},
                    new String[]{"Beware the allure of the vampire!", "My bite will cause endless pain!", "In the shadows, I reveal my true self.", "The dark side of immortality beckons.", "Feel the cold grip of eternal darkness."},
                    new String[]{"I thrive in the darkness, and so will you!", "Feel the embrace of the eternal night!", "Eternity in the gaze of a vampire.", "Our hearts beat in sync with the night.", "Join me in the everlasting dance of shadows."});

            case MUMMY -> new Monster("Mummy", 65, 80, 55, 75, true, false, false, false,
                    new String[]{"Bandage Wrap", "Ancient Curse", "Sands of Time", "Tomb's Embrace", "Eternal Rest"},
                    new String[]{"Unwrapping the past!", "Eternal slumber disturbed!", "Whispers of the ancient sands.", "Silent echoes from the burial chamber.", "Wrapped in the bandages of time."},
                    new String[]{"Ancient curses awaken!", "The mummy's wrath knows no bounds.", "Sands of time bury the unworthy.", "Tomb's embrace tightens its grip.", "Eternal rest disturbed."},
                    new String[]{"Wrapped in the warmth of our love!", "Feel the eternity in the mummy's tomb.", "Love sealed in the embrace of the ancient curse.", "Our love echoes through the corridors of time.", "Together in the eternity of the afterlife."});

            case CREEPER -> new Monster("Creeper", 70, 85, 55, 75, true, false, false, false,
                    new String[]{"Explode", "Sssss", "Creeper's Fury", "Boom Boom!", "Silent Blast"},
                    new String[]{"Hiss!", "Sizzle sizzle!", "Creeping in the shadows.", "Feel the tension before the explosion.", "Silent steps, explosive surprise."},
                    new String[]{"Watch out for the creeper's explosion!", "I'm about to blow your mind... and everything else!", "The blast of the creeper echoes.", "Boom Boom! You're in the danger zone.", "Silent steps, explosive reveal!"},
                    new String[]{"Creeping silently, until the big reveal!", "I'm the surprise in the shadows!", "In the quiet before the blast, feel our connection.", "Silent steps, explosive love!", "Boom! Love explodes in the creeper's heart."});

            case HARPY -> new Monster("Harpy", 75, 90, 55, 75, true, false, false, false,
                    new String[]{"Talon Slash", "Wind Gust", "Feather Dance", "Aerial Assault", "Sky's Embrace"},
                    new String[]{"Approaching silently on wings.", "Whispers carried by the breeze.", "Feathers gently rustle in the air.", "Subtle touch of wings in motion.", "Embracing the calm carried by the breeze."},
                    new String[]{"High above, the harpy descends!", "The talons of the harpy know no mercy.", "Winds carry the harpy's fury.", "Aerial dominance in every gust.", "Feel the storm of the harpy's wrath."},
                    new String[]{"Our love soars on the wings of my voice!", "Feel the tender breeze of our connection.", "In the embrace of the sky, love takes flight.", "Whispers of love in the wind.", "Our love, like feathers, dances in the air."});

            case CENTAUR -> new Monster("Centaur", 80, 95, 55, 75, true, false, false, false,
                    new String[]{"Bow Shot", "Hoof Kick", "Rapid Arrows", "Thundering Charge", "Nature's Wrath"},
                    new String[]{"Half human, half horse i am!", "Galloping charge!", "Echoes of hooves in the forest.", "The centaur's arrow whispers death.", "Feel the earth shake beneath my hooves."},
                    new String[]{"The centaur's bow strikes true!", "Trample beneath the hooves of the centaur.", "Nature itself lends strength to the charge.", "Swift as the wind, deadly as the storm.", "The forest echoes with the centaur's fury."},
                    new String[]{"Swift as the wind, powerful as the storm!", "Our love gallops with the grace of a centaur.", "Feel the heartbeat of nature in our love.", "The centaur's love is as wild as the forest.", "In the dance of hooves, our love finds rhythm."});

            case MINOTAUR -> new Monster("Minotaur", 85, 100, 55, 75, true, false, false, false,
                    new String[]{"Axe Swing", "Maze Charge", "Labyrinth's Grasp", "Rage of the Horns", "Mighty Roar"},
                    new String[]{"Roar!", "Lost in the labyrinth!", "Echoes of the minotaur's wrath.", "Maze walls tremble at my roar.", "My labyrinth hungers for the lost."},
                    new String[]{"In the maze of my rage, you'll find no escape!", "Minotaur's fury unleashed!", "Labyrinthine paths twist in my anger.", "Feel the maze closing in around you.", "Rage of the minotaur, unstoppable and wild."},
                    new String[]{"My axe cleaves through the strongest armor!", "The minotaur's labyrinthine wrath is upon you!", "In the dance of blades, find the rhythm of my wrath.", "Labyrinth's embrace tightens with each swing.", "The minotaur's love is a maze, and you're trapped in its heart."});

            case CYCLOPS -> new Monster("Cyclops", 90, 105, 75, 95, true, false, false, false,
                    new String[]{"Boulder Throw", "Single Eye Glare", "Titanic Stomp", "Cyclopean Crush", "Rockslide Embrace"},
                    new String[]{"One eye sees all!", "Thud!", "Cyclopean shadows loom.", "Feel the earth shake beneath the cyclops's gaze.", "Boulders whisper tales of the cyclops's might."},
                    new String[]{"A boulder descends upon you!", "The cyclops glare pierces through!", "Titanic stomp echoes through the battlefield.", "Cyclopean fury, unmatched and relentless.", "Rocks tremble in the cyclops's wrath."},
                    new String[]{"Feel the tremor of love in the cyclops's stomp!", "Our connection is as colossal as the cyclops.", "Love, like a boulder, crashes into the heart.", "In the cyclops's gaze, find the depth of affection.", "Cyclopean love, a force of nature."});

            case BASILISK -> new Monster("Basilisk", 95, 110, 75, 95, true, false, false, false,
                    new String[]{"Petrify Gaze", "Venomous Bite", "Stone's Embrace", "Serpentine Glare", "Silent Hiss"},
                    new String[]{"Hiss!", "Statue in your future!", "The basilisk's hiss echoes through stone.", "Gaze upon the serpent's eyes and feel the chill.", "A hiss as silent as the stone it creates."},
                    new String[]{"Basilisk's gaze turns flesh to stone!", "Feel the venomous bite of the serpent's kiss!", "Stone's cold embrace, an eternal stillness.", "Serpentine glare freezes the bravest hearts.", "Silent hiss, the harbinger of stony fate."},
                    new String[]{"A stare that petrifies and a bite that paralyzes!", "You've entered the basilisk's domain, prepare for stony stillness!", "In the stone-cold eyes, find the warmth of affection.", "Bite into the apple of love, sweet as serpent's venom.", "Our love, like stone, stands the test of time."});

            case GRIFFIN -> new Monster("Griffin", 100, 115, 75, 95, true, false, false, false,
                    new String[]{"Claw Swipe", "Wing Buffet", "Sky Roar", "Talon Gust", "Feather Frenzy"},
                    new String[]{"---Screech!", "Feathers in the storm!", "The griffin's screech echoes across the sky.", "Gust of wind from the beating wings.", "A feathered symphony of fury."},
                    new String[]{"Griffin soars through the heavens, talons ready!", "Feel the might of the griffin's wings and claws!", "Sky-roaring fury descends from above.", "Talon gust, a tempest on the wind.", "Feather frenzy, the dance of a mythical storm."},
                    new String[]{"Aerial onslaught from the king!", "I'm the storm that sweeps you off your feet!", "Our love soars high, like my majestic wings.", "Feel the gust of passion.", "In the feathered embrace, our connection takes flight."});

            case CHIMERA -> new Monster("Chimera", 105, 120, 75, 95, true, false, false, false,
                    new String[]{"Fire Breath", "Tail Whip", "Venomous Bite", "Triple Roar", "Inferno Claw"},
                    new String[]{"Roar!", "Three-headed terror!", "The chimera's roar echoes through the abyss.", "A venomous hiss accompanies the serpent's tail.", "Inferno claws scorch the earth."},
                    new String[]{"Chimera breathes fire and whips with serpent's tail!", "Feel the wrath of the three-headed beast!", "Venomous bite, a strike from the serpent's fang.", "Triple roar, a cacophony of chaos.", "Inferno claw, the fiery embrace of the chimera."},
                    new String[]{"A fusion of flame, venom, and claws!", "Chimera's threefold attack is unstoppable!", "In the venomous embrace, our connection strengthens.", "Feel the heat of passion, like the chimera's fiery breath.", "In the triple roar, hear the echoes of our bond."});

            case MEDUSA -> new Monster("Medusa", 110, 125, 75, 95, true, false, false, false,
                    new String[]{"Snake Bite", "Stone Gaze", "Venomous Hiss", "Coiled Strike", "Heart of Stone"},
                    new String[]{"Hiss of the serpent, a symphony of danger.", "The abyss shivers with the echo of my venomous hiss.", "Turn away, mortal, or feel the sting of serpent's fang.", "Coiled strike, witness the swift and deadly dance of the serpent.", "Heart of stone, my gaze freezes the very essence of time."},
                    new String[]{"Avoid the gaze or turn to stone!", "Feel the serpentine strike of Medusa.", "Venomous bite, a strike from the serpent's fang.", "Coiled strike, the serpent's swift and deadly attack.", "Heart of stone, the gaze that freezes time."},
                    new String[]{"Our love petrifies the heart with joy!", "Gaze into my eyes and feel the love, not the stone.", "In the venomous embrace, our connection strengthens.", "Coiled strike, the dance of serpentine love.", "Heart of stone, the love that lasts an eternity."});

            case WYVERN -> new Monster("Wyvern", 115, 130, 95, 105, true, false, false, false,
                    new String[]{"Tail Sweep", "Dive Bomb", "Wing Slash", "Fiery Roar", "Aerial Dominance"},
                    new String[]{"Roar!", "Wings of fury!", "A slash of wyvern's mighty wings.", "Fiery roar echoes through the skies.", "Aerial dominance, the wyvern rules the air."},
                    new String[]{"Wyvern's tail sweeps and wings buffet with furious might!", "Feel the wind from the wyvern's dive bomb!", "Wing slash, a swift and deadly blow.", "Fiery roar, the breath of the wyvern's inferno.", "Aerial dominance, the wyvern's reign continues."},
                    new String[]{"I'm the winged terror of the skies!", "Dive-bombing wyvern, ready for the kill!", "Wing slash, the wyvern's dance in the sky.", "Fiery roar, our connection burns with passion.", "Aerial dominance, our love soars above all."});

            case PHOENIX -> new Monster("Phoenix", 120, 135, 95, 105, true, false, false, false,
                    new String[]{"Fire Burst", "Rebirth", "Inferno Dance", "Eternal Flame", "Blazing Resurgence"},
                    new String[]{"Caw caw!", "Rising from ashes!", "Phoenix performs a fiery dance.", "Eternal flame, burning bright.", "Blazing resurgence, a rebirth in the inferno."},
                    new String[]{"Burning flames engulf you!", "Witness the rebirth of the phoenix.", "Inferno dance, the phoenix's fiery ballet.", "Eternal flame, our connection never extinguished.", "Blazing resurgence, the phoenix's triumphant return."},
                    new String[]{"Our love rises from the ashes!", "Feel the warmth of our connection in my flame's embrace.", "Inferno dance, our passion in every flicker.", "Eternal flame, our love burns eternally.", "Blazing resurgence, our connection reignites with intensity."});

            case KRAKEN -> new Monster("Kraken", 125, 140, 95, 105, true, false, false, false,
                    new String[]{"Tentacle Grasp", "Ink Cloud", "Deep-Sea Slam", "Abyssal Ensnare", "Squid's Embrace"},
                    new String[]{"Gurgle!", "Deep-sea menace!", "Kraken releases a fearsome slam.", "Abyssal ensnare, tentacles tightening.", "Squid's embrace, a watery hug."},
                    new String[]{"Kraken's tentacles grasp and ink clouds obscure!", "Feel the deep-sea menace of the legendary kraken!", "Abyssal slam, the kraken's mighty strike.", "Abyssal ensnare, your fate entwined.", "Squid's embrace, a tender moment in the deep."},
                    new String[]{"Tentacles that ensnare, and ink that blinds!", "I'm the terror lurking in the abyss!", "Abyssal slam, a force that can't be resisted.", "Abyssal ensnare, our connection tightens.", "Squid's embrace, our bond in the depths of the sea."});

            case BEHEMOTH -> new Monster("Behemoth", 130, 145, 95, 105, true, false, false, false,
                    new String[]{"Earthquake Stomp", "Meteor Shower", "Colossal Roar", "Mighty Tremor", "Behemoth's Wrath"},
                    new String[]{"Roar!", "Colossal power!", "Behemoth unleashes a mighty roar.", "Mighty tremor shakes the ground.", "Behemoth's wrath descends upon you."},
                    new String[]{"Behemoth's stomp causes earthquakes, and meteor shower descends!", "Feel the colossal power of the mighty behemoth!", "Colossal roar echoes through the battlefield.", "Mighty tremor, the ground shakes in fear.", "Behemoth's wrath, a force to be reckoned with."},
                    new String[]{"Stomping the earth and showering meteors!", "Behemoth, the embodiment of colossal might!", "Colossal roar, a symphony of power.", "Mighty tremor, the ground quakes in submission.", "Behemoth's wrath, a testament to its unstoppable might."});

            case DRAGON -> new Monster("Dragon", 150, 150, 95, 500, true, false, false, false,
                    new String[]{"Dragon Breath", "Wing Gust", "Fiery Roar", "Inferno Sweep", "Eternal Soar"},
                    new String[]{"Roar!", "Wings of fire!", "Dragon unleashes a fiery roar.", "Inferno sweep engulfs the battlefield.", "Eternal soar on the wings of the dragon."},
                    new String[]{"The dragon's breath engulfs all!", "Feel the gust of the dragon's wings.", "Fiery roar echoes through the skies.", "Inferno sweep, a blaze of draconic fury.", "Eternal soar, the dragon's wings carry our love."},
                    new String[]{"Our love roars with the fury of the dragon!", "Fly with me on the wings of eternal passion.", "Fiery roar, a symphony of draconic affection.", "Inferno sweep, the flames of our love burn bright.", "Eternal soar, our love transcends the highest peaks."});
        };
    }
}
