class MonsterFactory {

    public static Monster createMonster(MonsterType monsterType) {
        Quote quote;
        return switch (monsterType) {
            case SLIME -> new Monster("Slime", 15, 30, 15, 35, true, false, false, false,
                    new String[]{"Gelatinous Grasp", "Slime Splash", "Bouncy Bop", "Ooze Overture", "Squishy Slam"},
                    new Quote[]{
                            new Quote("Slime+neutral+1_out.wav", "Let's keep it slimey."),
                            new Quote("Slime+neutral+2_out.wav", "I'm gooey!"),
                            new Quote("Slime+neutral+3_out.wav", "Bloop bloop!"),
                            new Quote("Slime+neutral+4_out.wav", "Feel the squish of my attacks!"),
                            new Quote("Slime+neutral+5_out.wav", "Prepare for a slimy surprise.")
                    },
                    new Quote[]{
                            new Quote("Slime+anger+1_out.wav", "I'm not just a puddle of goo, you know!"),
                            new Quote("Slime+anger+2_out.wav", "I'm angry!"),
                            new Quote("Slime+anger+3_out.wav", "Get ready to be slimed!"),
                            new Quote("Slime+anger+4_out.wav", "Gooey wrath coming!"),
                            new Quote("Slime+anger+5_out.wav", "GLO GLO oohuuuh")
                    },
                    new Quote[]{
                            new Quote("Slime+seduce+1_out.wav", "Even slimes have feelings, you know?"),
                            new Quote("Slime+seduce+2_out.wav", "I'm feeling a bit...bubblieee."),
                            new Quote("Slime+seduce+3_out.wav", "Our connection is as gooey as love."),
                            new Quote("Slime+seduce+4_out.wav", "I love our slimy bond."),
                            new Quote("Slime+seduce+5_out.wav", "I'm gonna love the goo'out of you.")
                    });

            case BABYSPIDERS -> new Monster("Baby Spider", 20, 35, 15, 35, true, false, false, false,
                    new String[]{"Venomous Bite", "Web Spit", "Silk Wrap", "Arachnid Assault", "Spider Squeeze"},
                    new Quote[]{
                            new Quote("Baby+spider+neutral+1_out.wav", "No need to fear, we can coexist."),
                            new Quote("Baby+spider+neutral+2_out.wav", "Skittering sounds"),
                            new Quote("Baby+spider+neutral+3_out.wav", "Creeping up on you... quietly."),
                            new Quote("Baby+spider+neutral+4_out.wav", "Watch out, I'm quick!"),
                            new Quote("Baby+spider+neutral+5_out.wav", "I have a venomous bite!")
                    },
                    new Quote[]{
                            new Quote("Baby+spider+angry+1_out.wav", "You've angered the arachnid!"),
                            new Quote("Baby+spider+angry+2_out.wav", "My patience is wearing thin!"),
                            new Quote("Baby+spider+angry+3_out.wav", "You can't escape my silk!"),
                            new Quote("Baby+spider+angry+4_out.wav", "My web is a trap of fury!"),
                            new Quote("Baby+spider+angry+5_out.wav", "I'll weave your demise!")
                    },
                    new Quote[]{
                            new Quote("Baby+spider+seduce+1_out.wav", "Captivated by spider charm."),
                            new Quote("Baby+spider+seduce+2_out.wav", "The silk of love binds us."),
                            new Quote("Baby+spider+seduce+3_out.wav", "You're tangled in my love's web."),
                            new Quote("Baby+spider+seduce+4_out.wav", "Feel this delicate touch of mine"),
                            new Quote("Baby+spider+seduce+5_out.wav", "In the web of love, we're entwined.")
                    });

            case GOBLIN -> new Monster("Goblin", 25, 40, 15, 35, true, false, false, false,
                    new String[]{"Vicious Stab", "Rock Throw", "Goblin Ambush", "Sneaky Strike", "Mischief Slash"},
                    new Quote[]{
                            new Quote("Goblin+neutral+1_out.wav", "You disturb my home!"),
                            new Quote("Goblin+neutral+2_out.wav", "Grrr!"),
                            new Quote("Goblin+neutral+3_out.wav", "Beware the goblin mischief!"),
                            new Quote("Goblin+neutral+4_out.wav", "Goblins UNITE!"),
                            new Quote("Goblin+neutral+5_out.wav", "What are you doing here?")
                    },
                    new Quote[]{
                            new Quote("Goblin+angry+1_out.wav", "This is goblin territory!"),
                            new Quote("Goblin+angry+2_out.wav", "Time to face the goblin wrath!"),
                            new Quote("Goblin+angry+3_out.wav", "You've angered the goblin horde!"),
                            new Quote("Goblin+angry+4_out.wav", "Prepare for goblin mayhem!"),
                            new Quote("Goblin+angry+5_out.wav", "Goblin rage is unleashed!")
                    },
                    new Quote[]{
                            new Quote("Goblin+seduce+1_out.wav", "Captivated by goblin charm."),
                            new Quote("Goblin+seduce+2_out.wav", "I like shiny things, and mischief ;)"),
                            new Quote("Goblin+seduce+3_out.wav", "Hope you don't resist me"),
                            new Quote("Goblin+seduce+4_out.wav", "Feel the mischievous touch of goblin affection."),
                            new Quote("Goblin+seduce+5_out.wav", "Why fight... let's make a pleasurable arrangement?")
                    });

            case SKELETON -> new Monster("Skeleton", 30, 45, 15, 35, true, false, false, false,
                    new String[]{"Boner Attack", "Rattle", "Bone Crush", "Spooky Strike", "Graveyard Slam"},
                    new Quote[]{
                            new Quote("skeleton_neutral_1.wav", "Click clack!"),
                            new Quote("skeleton_neutral_2.wav", "Beware the bones!"),
                            new Quote("skeleton_neutral_3.wav", "Skeletons arise!"),
                            new Quote("skeleton_neutral_4.wav", "Rattling bones in the darkness."),
                            new Quote("skeleton_neutral_5.wav", "The undead march.")
                    },
                    new Quote[]{
                            new Quote("skeleton_anger_1.wav", "You can't defeat what's already dead!"),
                            new Quote("skeleton_anger_2.wav", "Skeletons have the best bone-chilling jokes."),
                            new Quote("skeleton_anger_3.wav", "Feel the chill of the grave!"),
                            new Quote("skeleton_anger_4.wav", "Bones of fury!"),
                            new Quote("skeleton_anger_5.wav", "Dance with the skeletons!")
                    },
                    new Quote[]{
                            new Quote("skeleton_seduce_1.wav", "Enthralled by skeletal charm."),
                            new Quote("skeleton_seduce_2.wav", "Embrace the bone-chilling love."),
                            new Quote("skeleton_seduce_3.wav", "Caught in the dance of the undead."),
                            new Quote("skeleton_seduce_4.wav", "Feel the skeletal passion."),
                            new Quote("skeleton_seduce_5.wav", "In the arms of the skeletal embrace.")
                    });

            case ZOMBIE -> new Monster("Zombie", 35, 50, 15, 35, true, false, false, false,
                    new String[]{"Bite", "Grasp", "Lurch", "Flesh Tear", "Rotting Slam"},
                    new Quote[]{
                            new Quote("Zombie+neutral+1_out.wav", "Braaaains! The undead hunger."),
                            new Quote("Zombie+neutral+2_out.wav", "This is the thriller"),
                            new Quote("Zombie+neutral+3_out.wav", "Graveyard whispers linger."),
                            new Quote("Zombie+neutral+4_out.wav", "Flesh Tear, a gruesome delight."),
                            new Quote("Zombie+neutral+5_out.wav", "Echoes of decay.")
                    },
                    new Quote[]{
                            new Quote("Zombie+anger+1_out.wav", "The undead hunger never ends!"),
                            new Quote("Zombie+anger+2_out.wav", "Flesh is my favorite snack!"),
                            new Quote("Zombie+anger+3_out.wav", "Zombie rage!"),
                            new Quote("Zombie+anger+4_out.wav", "Rotting and restless!"),
                            new Quote("Zombie+anger+5_out.wav", "With your bodies I feast")
                    },
                    new Quote[]{
                            new Quote("Zombie+seduce+1_out.wav", "Ensnared by the undead charm."),
                            new Quote("Zombie+seduce+2_out.wav", "Sleep in my cold embrace."),
                            new Quote("Zombie+seduce+3_out.wav", "I want your brains... and your heart!"),
                            new Quote("Zombie+seduce+4_out.wav", "Feel the decaying love."),
                            new Quote("Zombie+seduce+5_out.wav", "Watch these moves. (;")
                    });

            case SPECTRE -> new Monster("Spectre", 40, 55, 35, 55, true, true, false, false,
                    new String[]{"Ethereal Touch", "Soul Drain", "Shadow Strike", "Ghostly Wail", "Phantom Embrace"},
                    new Quote[]{
                            new Quote("Spectre+neutral+1_out.wav", "Haunting your dreams!"),
                            new Quote("Spectre+neutral+2_out.wav", "Wandering spirit!"),
                            new Quote("Spectre+neutral+3_out.wav", "Whispers in the dark."),
                            new Quote("Spectre+neutral+4_out.wav", "Ephemeral presence."),
                            new Quote("Spectre+neutral+5_out.wav", "Chilling.")
                    },
                    new Quote[]{
                            new Quote("Spectre+angry+1_out.wav", "I'm the whisper in the shadows!"),
                            new Quote("Spectre+angry+2_out.wav", "Your nightmares brought to life!"),
                            new Quote("Spectre+angry+3_out.wav", "Fear the ethereal touch!"),
                            new Quote("Spectre+angry+4_out.wav", "Spectral wrath unleashed!"),
                            new Quote("Spectre+angry+5_out.wav", "Ghostly vengeance!")
                    },
                    new Quote[]{
                            new Quote("Spectre+seduced+1_out.wav", "Enveloped in the spectral allure."),
                            new Quote("Spectre+seduced+2_out.wav", "Dancing with shadows."),
                            new Quote("Spectre+seduced+3_out.wav", "Embrace the ghostly love."),
                            new Quote("Spectre+seduced+4_out.wav", "By me, you will be bewitched."),
                            new Quote("Spectre+seduced+5_out.wav", "Soul entwined.")
                    });

            case WEREWOLF -> new Monster("Werewolf", 45, 60, 35, 55, true, false, false, false,
                    new String[]{"Claw Slash", "Howl", "Moonlit Pounce", "Feral Lunge", "Lunar Fury"},
                    new Quote[]{
                            new Quote("Werewolf+neutral+1_out.wav", "Awooo!"),
                            new Quote("Werewolf+neutral+2_out.wav", "Night is my domain!"),
                            new Quote("Werewolf+neutral+3_out.wav", "Moonlit serenade."),
                            new Quote("Werewolf+neutral+4_out.wav", "Prowling in the shadows."),
                            new Quote("Werewolf+neutral+5_out.wav", "Wild and untamed.")
                    },
                    new Quote[]{
                            new Quote("Werewolf+rage+1_out.wav", "The moon empowers me!"),
                            new Quote("Werewolf+rage+2_out.wav", "Beware the fury of the werewolf!"),
                            new Quote("Werewolf+rage+3_out.wav", "Lunar wrath unleashed!"),
                            new Quote("Werewolf+rage+4_out.wav", "Feel the feral rage!"),
                            new Quote("Werewolf+rage+5_out.wav", "Embrace the moonlit savagery!")
                    },
                    new Quote[]{
                            new Quote("Werewolf+seduced+1_out.wav", "In the moonlight's tender embrace."),
                            new Quote("Werewolf+seduced+2_out.wav", "My heart beats with the moon's rhythm."),
                            new Quote("Werewolf+seduced+3_out.wav", "Feel the love in the moonlight!"),
                            new Quote("Werewolf+seduced+4_out.wav", "Wild love under the moon."),
                            new Quote("Werewolf+seduced+5_out.wav", "Moonlit passion in every howl.")
                    });

            case GHOST -> new Monster("Ghost", 50, 65, 35, 55, true, true, false, false,
                    new String[]{"Haunt", "Vanish", "Ethereal Grasp", "Spectral Wail", "Ghostly Embrace"},
                    new Quote[]{
                            new Quote("Ghost+neutral+1_out.wav", "Boo!"),
                            new Quote("Ghost+neutral+2_out.wav", "Can't touch me!"),
                            new Quote("Ghost+neutral+3_out.wav", "Whispers in the shadows."),
                            new Quote("Ghost+neutral+4_out.wav", "Dancing in the ethereal realm."),
                            new Quote("Ghost+neutral+5_out.wav", "Ghostly echoes.")
                    },
                    new Quote[]{
                            new Quote("Ghost+angry+1_out.wav", "In the realm between life and death, I am unstoppable!"),
                            new Quote("Ghost+angry+2_out.wav", "You cannot escape the ghost's grasp."),
                            new Quote("Ghost+angry+3_out.wav", "Hunting the living with ethereal power!"),
                            new Quote("Ghost+angry+4_out.wav", "A ghost's vengeance is swift!"),
                            new Quote("Ghost+angry+5_out.wav", "Feel the ghostly wrath!")
                    },
                    new Quote[]{
                            new Quote("Ghost+seduced+1_out.wav", "Your love warms my spectral heart!"),
                            new Quote("Ghost+seduced+2_out.wav", "Eternally bound by ghostly affection."),
                            new Quote("Ghost+seduced+3_out.wav", "In the dance of the spirits, we unite."),
                            new Quote("Ghost+seduced+4_out.wav", "The haunting beauty of our connection."),
                            new Quote("Ghost+seduced+5_out.wav", "Love transcends even death.")
                    });

            case WITCH -> new Monster("Witch", 55, 70, 35, 55, true, false, false, false,
                    new String[]{"Spell Cast", "Potion Toss", "Enchanting Hex", "Mystic Blast", "Witch's Embrace"},
                    new Quote[]{
                            new Quote("Witch+neutral+1_out.wav", "Double, double, toil and trouble!"),
                            new Quote("Witch+neutral+2_out.wav", "You're in my hex!"),
                            new Quote("Witch+neutral+3_out.wav", "Whispers of ancient incantations."),
                            new Quote("Witch+neutral+4_out.wav", "Potion bubbling in the cauldron."),
                            new Quote("Witch+neutral+5_out.wav", "Mystical energies surround us.")
                    },
                    new Quote[]{
                            new Quote("Witch+anger+1_out.wav", "Magic flows through my veins!"),
                            new Quote("Witch+anger+2_out.wav", "The witch's brew will seal your fate."),
                            new Quote("Witch+anger+3_out.wav", "Hexes and curses!"),
                            new Quote("Witch+anger+4_out.wav", "Feel the magical wrath of a witch"),
                            new Quote("Witch+anger+5_out.wav", "Doomed by the mystic forces!")
                    },
                    new Quote[]{
                            new Quote("Witch+seduced+1_out.wav", "Enchanted by your presence, my dear!"),
                            new Quote("Witch+seduced+2_out.wav", "A spell of love is cast upon us."),
                            new Quote("Witch+seduced+3_out.wav", "In the dance of enchantment, we are entwined."),
                            new Quote("Witch+seduced+4_out.wav", "Feel the magical embrace of love."),
                            new Quote("Witch+seduced+5_out.wav", "Our love is a potion of eternal bliss.")
                    });

            case VAMPIRE -> new Monster("Vampire", 60, 75, 35, 55, true, false, false, false,
                    new String[]{"Bite", "Hypnotize", "Night's Embrace", "Dark Kiss", "Eternal Thirst"},
                    new Quote[]{
                            new Quote("Vampire+neutral+1_out.wav", "I vant to suck your blood!"),
                            new Quote("Vampire+neutral+2_out.wav", "Night is eternal!"),
                            new Quote("Vampire+neutral+3_out.wav", "Whispers of the nocturnal creatures."),
                            new Quote("Vampire+neutral+4_out.wav", "Moonlight glimmers"),
                            new Quote("Vampire+neutral+5_out.wav", "Bats herald my nocturnal presence.")
                    },
                    new Quote[]{
                            new Quote("Vampire+angry+1_out.wav", "Beware the allure of the vampire!"),
                            new Quote("Vampire+angry+2_out.wav", "My bite will cause endless pain!"),
                            new Quote("Vampire+angry+3_out.wav", "In the shadows, I reveal my true self."),
                            new Quote("Vampire+angry+4_out.wav", "The dark side of immortality beckons."),
                            new Quote("Vampire+angry+5_out.wav", "Feel the cold grip of eternal darkness.")
                    },
                    new Quote[]{
                            new Quote("Vampire+seduce+1_out.wav", "I thrive in the darkness, and so will you!"),
                            new Quote("Vampire+seduce+2_out.wav", "Feel the embrace of the eternal night!"),
                            new Quote("Vampire+seduce+3_out.wav", "Eternity in the gaze of a vampire."),
                            new Quote("Vampire+seduce+4_out.wav", "Our hearts beat in sync with the night."),
                            new Quote("Vampire+seduce+5_out.wav", "Join me in the everlasting dance of shadows.")
                    });

            case MUMMY -> new Monster("Mummy", 65, 80, 55, 75, true, false, false, false,
                    new String[]{"Bandage Wrap", "Ancient Curse", "Sands of Time", "Tomb's Embrace", "Eternal Rest"},
                    new Quote[]{
                            new Quote("mummy_neutral_1.wav", "Unwrapping the past!"),
                            new Quote("mummy_neutral_2.wav", "Eternal slumber disturbed!"),
                            new Quote("mummy_neutral_3.wav", "Whispers of the ancient sands."),
                            new Quote("mummy_neutral_4.wav", "Silent echoes from the burial chamber."),
                            new Quote("mummy_neutral_5.wav", "Wrapped in the bandages of time.")
                    },
                    new Quote[]{
                            new Quote("mummy_anger_1.wav", "Ancient curses awaken!"),
                            new Quote("mummy_anger_2.wav", "The mummy's wrath knows no bounds."),
                            new Quote("mummy_anger_3.wav", "Sands of time bury the unworthy."),
                            new Quote("mummy_anger_4.wav", "Tomb's embrace tightens its grip."),
                            new Quote("mummy_anger_5.wav", "Eternal rest disturbed.")
                    },
                    new Quote[]{
                            new Quote("mummy_seduce_1.wav", "Wrapped in the warmth of our love!"),
                            new Quote("mummy_seduce_2.wav", "Feel the eternity in the mummy's tomb."),
                            new Quote("mummy_seduce_3.wav", "Love sealed in the embrace of the ancient curse."),
                            new Quote("mummy_seduce_4.wav", "Our love echoes through the corridors of time."),
                            new Quote("mummy_seduce_5.wav", "Together in the eternity of the afterlife.")
                    });

            case CREEPER -> new Monster("Creeper", 70, 85, 55, 75, true, false, false, false,
                    new String[]{"Explode", "Sssss", "Creeper's Fury", "Boom Boom!", "Silent Blast"},
                    new Quote[]{
                            new Quote("creeper_neutral_1.wav", "Hiss!"),
                            new Quote("creeper_neutral_2.wav", "Sizzle sizzle!"),
                            new Quote("creeper_neutral_3.wav", "Creeping in the shadows."),
                            new Quote("creeper_neutral_4.wav", "Feel the tension before the explosion."),
                            new Quote("creeper_neutral_5.wav", "Silent steps, explosive surprise.")
                    },
                    new Quote[]{
                            new Quote("creeper_anger_1.wav", "Watch out for the creeper's explosion!"),
                            new Quote("creeper_anger_2.wav", "I'm about to blow your mind... and everything else!"),
                            new Quote("creeper_anger_3.wav", "The blast of the creeper echoes."),
                            new Quote("creeper_anger_4.wav", "Boom Boom! You're in the danger zone."),
                            new Quote("creeper_anger_5.wav", "Silent steps, explosive reveal!")
                    },
                    new Quote[]{
                            new Quote("creeper_seduce_1.wav", "Creeping silently, until the big reveal!"),
                            new Quote("creeper_seduce_2.wav", "I'm the surprise in the shadows!"),
                            new Quote("creeper_seduce_3.wav", "In the quiet before the blast, feel our connection."),
                            new Quote("creeper_seduce_4.wav", "Silent steps, explosive love!"),
                            new Quote("creeper_seduce_5.wav", "Boom! Love explodes in the creeper's heart.")
                    });

            case HARPY -> new Monster("Harpy", 75, 90, 55, 75, true, false, false, false,
                    new String[]{"Talon Slash", "Wind Gust", "Feather Dance", "Aerial Assault", "Sky's Embrace"},
                    new Quote[]{
                            new Quote("harpy_neutral_1.wav", "Approaching silently on wings."),
                            new Quote("harpy_neutral_2.wav", "Whispers carried by the breeze."),
                            new Quote("harpy_neutral_3.wav", "Feathers gently rustle in the air."),
                            new Quote("harpy_neutral_4.wav", "Subtle touch of wings in motion."),
                            new Quote("harpy_neutral_5.wav", "Embracing the calm carried by the breeze.")
                    },
                    new Quote[]{
                            new Quote("harpy_anger_1.wav", "High above, the harpy descends!"),
                            new Quote("harpy_anger_2.wav", "The talons of the harpy know no mercy."),
                            new Quote("harpy_anger_3.wav", "Winds carry the harpy's fury."),
                            new Quote("harpy_anger_4.wav", "Aerial dominance in every gust."),
                            new Quote("harpy_anger_5.wav", "Feel the storm of the harpy's wrath.")
                    },
                    new Quote[]{
                            new Quote("harpy_seduce_1.wav", "Our love soars on the wings of my voice!"),
                            new Quote("harpy_seduce_2.wav", "Feel the tender breeze of our connection."),
                            new Quote("harpy_seduce_3.wav", "In the embrace of the sky, love takes flight."),
                            new Quote("harpy_seduce_4.wav", "Whispers of love in the wind."),
                            new Quote("harpy_seduce_5.wav", "Our love, like feathers, dances in the air.")
                    });

            case CENTAUR -> new Monster("Centaur", 80, 95, 55, 75, true, false, false, false,
                    new String[]{"Bow Shot", "Hoof Kick", "Rapid Arrows", "Thundering Charge", "Nature's Wrath"},
                    new Quote[]{
                            new Quote("centaur_neutral_1.wav", "Half human, half horse I am!"),
                            new Quote("centaur_neutral_2.wav", "Galloping charge!"),
                            new Quote("centaur_neutral_3.wav", "Echoes of hooves in the forest."),
                            new Quote("centaur_neutral_4.wav", "The centaur's arrow whispers death."),
                            new Quote("centaur_neutral_5.wav", "Feel the earth shake beneath my hooves.")
                    },
                    new Quote[]{
                            new Quote("centaur_anger_1.wav", "The centaur's bow strikes true!"),
                            new Quote("centaur_anger_2.wav", "Trample beneath the hooves of the centaur."),
                            new Quote("centaur_anger_3.wav", "Nature itself lends strength to the charge."),
                            new Quote("centaur_anger_4.wav", "Swift as the wind, deadly as the storm."),
                            new Quote("centaur_anger_5.wav", "The forest echoes with the centaur's fury.")
                    },
                    new Quote[]{
                            new Quote("centaur_seduce_1.wav", "Swift as the wind, powerful as the storm!"),
                            new Quote("centaur_seduce_2.wav", "Our love gallops with the grace of a centaur."),
                            new Quote("centaur_seduce_3.wav", "Feel the heartbeat of nature in our love."),
                            new Quote("centaur_seduce_4.wav", "The centaur's love is as wild as the forest."),
                            new Quote("centaur_seduce_5.wav", "In the dance of hooves, our love finds rhythm.")
                    });

            case MINOTAUR -> new Monster("Minotaur", 85, 100, 55, 75, true, false, false, false,
                    new String[]{"Axe Swing", "Maze Charge", "Labyrinth's Grasp", "Rage of the Horns", "Mighty Roar"},
                    new Quote[]{
                            new Quote("Minotaur+neutral+1_out.wav", "Roar!"),
                            new Quote("Minotaur+neutral+2_out.wav", "Lost in the labyrinth!"),
                            new Quote("Minotaur+neutral+3_out.wav", "Echoes of the minotaur's wrath."),
                            new Quote("Minotaur+neutral+4_out.wav", "Maze walls tremble at my roar."),
                            new Quote("Minotaur+neutral+5_out.wav", "My labyrinth hungers for the lost.")
                    },
                    new Quote[]{
                            new Quote("Minotaur+rage+1_out.wav", "In the maze of my rage, you'll find no escape!"),
                            new Quote("Minotaur+rage+2_out.wav", "Minotaur's fury unleashed!"),
                            new Quote("Minotaur+rage+3_out.wav", "Labyrinthine paths twist in my anger."),
                            new Quote("Minotaur+rage+4_out.wav", "Feel the maze closing in around you."),
                            new Quote("Minotaur+rage+5_out.wav", "Rage of the minotaur, unstoppable and wild.")
                    },
                    new Quote[]{
                            new Quote("Minotaur+seduce+1_out.wav", "My axe cleaves through the strongest armor!"),
                            new Quote("Minotaur+seduce+2_out.wav", "The minotaur's labyrinthine wrath is upon you!"),
                            new Quote("Minotaur+seduce+3_out.wav", "In the dance of blades, find the rhythm of my wrath."),
                            new Quote("Minotaur+seduce+4_out.wav", "Labyrinth's embrace tightens with each swing."),
                            new Quote("Minotaur+seduce+5_out.wav", "The minotaur's love is a maze, and you're trapped in its heart.")
                    });

            case CYCLOPS -> new Monster("Cyclops", 90, 105, 75, 95, true, false, false, false,
                    new String[]{"Boulder Throw", "Single Eye Glare", "Titanic Stomp", "Cyclopean Crush", "Rockslide Embrace"},
                    new Quote[]{
                            new Quote("Cyclops+neutral+1_out.wav", "One eye sees all!"),
                            new Quote("Cyclops+neutral+2_out.wav", "Thud!"),
                            new Quote("Cyclop+neutral+3_out.wav", "Cyclopean shadows loom."),
                            new Quote("Cyclops+neutral+4_out.wav", "Feel the earth shake beneath the cyclops's gaze."),
                            new Quote("Cyclops+neutral+5_out.wav", "Boulders whisper tales of the cyclops's might.")
                    },
                    new Quote[]{
                            new Quote("Cyclops+rage+1_out.wav", "A boulder descends upon you!"),
                            new Quote("Cyclops+rage+2_out.wav", "The cyclops glare pierces through!"),
                            new Quote("Cyclops+rage+3_out.wav", "Titanic stomp echoes through the battlefield."),
                            new Quote("Cyclops+rage+4_out.wav", "Cyclopean fury, unmatched and relentless."),
                            new Quote("Cyclops+rage+5_out.wav", "Rocks tremble in the cyclops's wrath.")
                    },
                    new Quote[]{
                            new Quote("Cyclops+seduce+1_out.wav", "Feel the tremor of love in the cyclops's stomp!"),
                            new Quote("Cyclops+seduce+2_out.wav", "Our connection is as colossal as the cyclops."),
                            new Quote("Cyclops+seduce+3_out.wav", "Love, like a boulder, crashes into the heart."),
                            new Quote("Cyclops+seduce+4_out.wav", "In the cyclops's gaze, find the depth of affection."),
                            new Quote("Cyclops+seduce+5_out.wav", "Cyclopean love, a force of nature.")
                    });

            case BASILISK -> new Monster("Basilisk", 95, 110, 75, 95, true, false, false, false,
                    new String[]{"Petrify Gaze", "Venomous Bite", "Stone's Embrace", "Serpentine Glare", "Silent Hiss"},
                    new Quote[]{
                            new Quote("basilisk_neutral_1.wav", "Hiss!"),
                            new Quote("basilisk_neutral_2.wav", "Statue in your future!"),
                            new Quote("basilisk_neutral_3.wav", "The basilisk's hiss echoes through stone."),
                            new Quote("basilisk_neutral_4.wav", "Gaze upon the serpent's eyes and feel the chill."),
                            new Quote("basilisk_neutral_5.wav", "A hiss as silent as the stone it creates.")
                    },
                    new Quote[]{
                            new Quote("basilisk_anger_1.wav", "Basilisk's gaze turns flesh to stone!"),
                            new Quote("basilisk_anger_2.wav", "Feel the venomous bite of the serpent's kiss!"),
                            new Quote("basilisk_anger_3.wav", "Stone's cold embrace, an eternal stillness."),
                            new Quote("basilisk_anger_4.wav", "Serpentine glare freezes the bravest hearts."),
                            new Quote("basilisk_anger_5.wav", "Silent hiss, the harbinger of stony fate.")
                    },
                    new Quote[]{
                            new Quote("basilisk_seduce_1.wav", "A stare that petrifies and a bite that paralyzes!"),
                            new Quote("basilisk_seduce_2.wav", "You've entered the basilisk's domain, prepare for stony stillness!"),
                            new Quote("basilisk_seduce_3.wav", "In the stone-cold eyes, find the warmth of affection."),
                            new Quote("basilisk_seduce_4.wav", "Bite into the apple of love, sweet as serpent's venom."),
                            new Quote("basilisk_seduce_5.wav", "Our love, like stone, stands the test of time.")
                    });

            case GRIFFIN -> new Monster("Griffin", 100, 115, 75, 95, true, false, false, false,
                    new String[]{"Claw Swipe", "Wing Buffet", "Sky Roar", "Talon Gust", "Feather Frenzy"},
                    new Quote[]{
                            new Quote("griffin_neutral_1.wav", "---Screech!"),
                            new Quote("griffin_neutral_2.wav", "Feathers in the storm!"),
                            new Quote("griffin_neutral_3.wav", "The griffin's screech echoes across the sky."),
                            new Quote("griffin_neutral_4.wav", "Gust of wind from the beating wings."),
                            new Quote("griffin_neutral_5.wav", "A feathered symphony of fury.")
                    },
                    new Quote[]{
                            new Quote("griffin_anger_1.wav", "Griffin soars through the heavens, talons ready!"),
                            new Quote("griffin_anger_2.wav", "Feel the might of the griffin's wings and claws!"),
                            new Quote("griffin_anger_3.wav", "Sky-roaring fury descends from above."),
                            new Quote("griffin_anger_4.wav", "Talon gust, a tempest on the wind."),
                            new Quote("griffin_anger_5.wav", "Feather frenzy, the dance of a mythical storm.")
                    },
                    new Quote[]{
                            new Quote("griffin_seduce_1.wav", "Aerial onslaught from the king!"),
                            new Quote("griffin_seduce_2.wav", "I'm the storm that sweeps you off your feet!"),
                            new Quote("griffin_seduce_3.wav", "Our love soars high, like my majestic wings."),
                            new Quote("griffin_seduce_4.wav", "Feel the gust of passion."),
                            new Quote("griffin_seduce_5.wav", "In the feathered embrace, our connection takes flight.")
                    });

            case CHIMERA -> new Monster("Chimera", 105, 120, 75, 95, true, false, false, false,
                    new String[]{"Fire Breath", "Tail Whip", "Venomous Bite", "Triple Roar", "Inferno Claw"},
                    new Quote[]{
                            new Quote("chimera_neutral_1.wav", "Roar!"),
                            new Quote("chimera_neutral_2.wav", "Three-headed terror!"),
                            new Quote("chimera_neutral_3.wav", "The chimera's roar echoes through the abyss."),
                            new Quote("chimera_neutral_4.wav", "A venomous hiss accompanies the serpent's tail."),
                            new Quote("chimera_neutral_5.wav", "Inferno claws scorch the earth.")
                    },
                    new Quote[]{
                            new Quote("chimera_anger_1.wav", "Chimera breathes fire and whips with serpent's tail!"),
                            new Quote("chimera_anger_2.wav", "Feel the wrath of the three-headed beast!"),
                            new Quote("chimera_anger_3.wav", "Venomous bite, a strike from the serpent's fang."),
                            new Quote("chimera_anger_4.wav", "Triple roar, a cacophony of chaos."),
                            new Quote("chimera_anger_5.wav", "Inferno claw, the fiery embrace of the chimera.")
                    },
                    new Quote[]{
                            new Quote("chimera_seduce_1.wav", "A fusion of flame, venom, and claws!"),
                            new Quote("chimera_seduce_2.wav", "Chimera's threefold attack is unstoppable!"),
                            new Quote("chimera_seduce_3.wav", "In the venomous embrace, our connection strengthens."),
                            new Quote("chimera_seduce_4.wav", "Feel the heat of passion, like the chimera's fiery breath."),
                            new Quote("chimera_seduce_5.wav", "In the triple roar, hear the echoes of our bond.")
                    });

            case MEDUSA -> new Monster("Medusa", 110, 125, 75, 95, true, false, false, false,
                    new String[]{"Snake Bite", "Stone Gaze", "Venomous Hiss", "Coiled Strike", "Heart of Stone"},
                    new Quote[]{
                            new Quote("medusa_neutral_1.wav", "Hiss of the serpent, a symphony of danger."),
                            new Quote("medusa_neutral_2.wav", "The abyss shivers with the echo of my venomous hiss."),
                            new Quote("medusa_neutral_3.wav", "Turn away, mortal, or feel the sting of the serpent's fang."),
                            new Quote("medusa_neutral_4.wav", "Coiled strike, witness the swift and deadly dance of the serpent."),
                            new Quote("medusa_neutral_5.wav", "Heart of stone, my gaze freezes the very essence of time.")
                    },
                    new Quote[]{
                            new Quote("medusa_anger_1.wav", "Avoid the gaze or turn to stone!"),
                            new Quote("medusa_anger_2.wav", "Feel the serpentine strike of Medusa."),
                            new Quote("medusa_anger_3.wav", "Venomous bite, a strike from the serpent's fang."),
                            new Quote("medusa_anger_4.wav", "Coiled strike, the serpent's swift and deadly attack."),
                            new Quote("medusa_anger_5.wav", "Heart of stone, the gaze that freezes time.")
                    },
                    new Quote[]{
                            new Quote("medusa_seduce_1.wav", "Our love petrifies the heart with joy!"),
                            new Quote("medusa_seduce_2.wav", "Gaze into my eyes and feel the love, not the stone."),
                            new Quote("medusa_seduce_3.wav", "In the venomous embrace, our connection strengthens."),
                            new Quote("medusa_seduce_4.wav", "Coiled strike, the dance of serpentine love."),
                            new Quote("medusa_seduce_5.wav", "Heart of stone, the love that lasts an eternity.")
                    });

            case WYVERN -> new Monster("Wyvern", 115, 130, 95, 105, true, false, false, false,
                    new String[]{"Tail Sweep", "Dive Bomb", "Wing Slash", "Fiery Roar", "Aerial Dominance"},
                    new Quote[]{
                            new Quote("wyvern_neutral_1.wav", "Roarrr!"),
                            new Quote("wyvern_neutral_2.wav", "Roarrrararaara!"),
                            new Quote("wyvern_neutral_3.wav", "Grgrgraaaa!"),
                            new Quote("wyvern_neutral_4.wav", "Raaaaaaaaaaaaa ru"),
                            new Quote("wyvern_neutral_5.wav", "Rauuuuuuuuuu gaaa")
                    },
                    new Quote[]{
                            new Quote("wyvern_anger_1.wav", "RAAAAAAAAAAAAAAAAAAA"),
                            new Quote("wyvern_anger_2.wav", "Rura daaaaaaaa!!"),
                            new Quote("wyvern_anger_3.wav", "Raooo!!"),
                            new Quote("wyvern_anger_4.wav", "RU VA DAAA"),
                            new Quote("wyvern_anger_5.wav", "RUAMMM")
                    },
                    new Quote[]{
                            new Quote("wyvern_seduce_1.wav", "Ra ra u gagaaa"),
                            new Quote("wyvern_seduce_2.wav", "Rommm rommm"),
                            new Quote("wyvern_seduce_3.wav", "Raurrr!"),
                            new Quote("wyvern_seduce_4.wav", "Riauuuu"),
                            new Quote("wyvern_seduce_5.wav", "Ri re ro rauuu ro rauu!")
                    });

            case PHOENIX -> new Monster("Phoenix", 120, 135, 95, 105, true, false, false, false,
                    new String[]{"Fire Burst", "Rebirth", "Inferno Dance", "Eternal Flame", "Blazing Resurgence"},
                    new Quote[]{
                            new Quote("phoenix_neutral_1.wav", "Caw caw!"),
                            new Quote("phoenix_neutral_2.wav", "Rising from ashes!"),
                            new Quote("phoenix_neutral_3.wav", "Phoenix performs a fiery dance."),
                            new Quote("phoenix_neutral_4.wav", "Eternal flame, burning bright."),
                            new Quote("phoenix_neutral_5.wav", "Blazing resurgence, a rebirth in the inferno.")
                    },
                    new Quote[]{
                            new Quote("phoenix_anger_1.wav", "Burning flames engulf you!"),
                            new Quote("phoenix_anger_2.wav", "Witness the rebirth of the phoenix."),
                            new Quote("phoenix_anger_3.wav", "Inferno dance, the phoenix's fiery ballet."),
                            new Quote("phoenix_anger_4.wav", "Eternal flame, our connection never extinguished."),
                            new Quote("phoenix_anger_5.wav", "Blazing resurgence, the phoenix's triumphant return.")
                    },
                    new Quote[]{
                            new Quote("phoenix_seduce_1.wav", "Our love rises from the ashes!"),
                            new Quote("phoenix_seduce_2.wav", "Feel the warmth of our connection in my flame's embrace."),
                            new Quote("phoenix_seduce_3.wav", "Inferno dance, our passion in every flicker."),
                            new Quote("phoenix_seduce_4.wav", "Eternal flame, our love burns eternally."),
                            new Quote("phoenix_seduce_5.wav", "Blazing resurgence, our connection reignites with intensity.")
                    });

            case KRAKEN -> new Monster("Kraken", 125, 140, 95, 105, true, false, false, false,
                    new String[]{"Tentacle Grasp", "Ink Cloud", "Deep-Sea Slam", "Abyssal Ensnare", "Squid's Embrace"},
                    new Quote[]{
                            new Quote("kraken_neutral_1.wav", "Gurgle!"),
                            new Quote("kraken_neutral_2.wav", "Deep-sea menace!"),
                            new Quote("kraken_neutral_3.wav", "Kraken releases a fearsome slam."),
                            new Quote("kraken_neutral_4.wav", "Abyssal ensnare, tentacles tightening."),
                            new Quote("kraken_neutral_5.wav", "Squid's embrace, a watery hug.")
                    },
                    new Quote[]{
                            new Quote("kraken_anger_1.wav", "Kraken's tentacles grasp and ink clouds obscure!"),
                            new Quote("kraken_anger_2.wav", "Feel the deep-sea menace of the legendary kraken!"),
                            new Quote("kraken_anger_3.wav", "Abyssal slam, the kraken's mighty strike."),
                            new Quote("kraken_anger_4.wav", "Abyssal ensnare, your fate entwined."),
                            new Quote("kraken_anger_5.wav", "Squid's embrace, a tender moment in the deep.")
                    },
                    new Quote[]{
                            new Quote("kraken_seduce_1.wav", "Tentacles that ensnare, and ink that blinds!"),
                            new Quote("kraken_seduce_2.wav", "I'm the terror lurking in the abyss!"),
                            new Quote("kraken_seduce_3.wav", "Abyssal slam, a force that can't be resisted."),
                            new Quote("kraken_seduce_4.wav", "Abyssal ensnare, our connection tightens."),
                            new Quote("kraken_seduce_5.wav", "Squid's embrace, our bond in the depths of the sea.")
                    });

            case BEHEMOTH -> new Monster("Behemoth", 130, 145, 95, 105, true, false, false, false,
                    new String[]{"Earthquake Stomp", "Meteor Shower", "Colossal Roar", "Mighty Tremor", "Behemoth's Wrath"},
                    new Quote[]{
                            new Quote("Behemoth+neutral+1_out.wav", "Roar!"),
                            new Quote("Behemoth+neutral+2_out.wav", "Colossal power!"),
                            new Quote("Behemoth+neutral+3_out.wav", "Behemoth unleashes a mighty roar."),
                            new Quote("Behemoth+neutral+4_out.wav", "Mighty tremor shakes the ground."),
                            new Quote("Behemoth+neutral+5_out.wav", "Behemoth's wrath descends upon you.")
                    },
                    new Quote[]{
                            new Quote("Behemoth+rage+1_out.wav", "Behemoth's stomp causes earthquakes, and meteor shower descends!"),
                            new Quote("Behemoth+rage+2_out.wav", "Feel the colossal power of the mighty behemoth!"),
                            new Quote("Behemoth+rage+3_out.wav", "Colossal roar echoes through the battlefield."),
                            new Quote("Behemoth+rage+4_out.wav", "Mighty tremor, the ground shakes in fear."),
                            new Quote("Behemoth+rage+5_out.wav", "Behemoth's wrath, a force to be reckoned with.")
                    },
                    new Quote[]{
                            new Quote("Behemoth+seduced+1_out.wav", "Stomping the earth and showering meteors!"),
                            new Quote("Behemoth+seduced+2_out.wav", "Behemoth, the embodiment of colossal might!"),
                            new Quote("Behemoth+seduced+3_out.wav", "Colossal roar, a symphony of power."),
                            new Quote("Behemoth+seduced+4_out.wav", "Mighty tremor, the ground quakes in submission."),
                            new Quote("Behemoth+seduced+5_out.wav", "Behemoth's wrath, a testament to its unstoppable might.")
                    });

            case DRAGON -> new Monster("Dragon", 150, 150, 95, 500, true, false, false, false,
                    new String[]{"Dragon Breath", "Wing Gust", "Fiery Roar", "Inferno Sweep", "Eternal Soar"},
                    new Quote[]{
                            new Quote("dragon_neutral_1.wav", "Roar!"),
                            new Quote("dragon_neutral_2.wav", "Wings of fire!"),
                            new Quote("dragon_neutral_3.wav", "Dragon unleashes a fiery roar."),
                            new Quote("dragon_neutral_4.wav", "Inferno sweep engulfs the battlefield."),
                            new Quote("dragon_neutral_5.wav", "Eternal soar on the wings of the dragon.")
                    },
                    new Quote[]{
                            new Quote("dragon_anger_1.wav", "The dragon's breath engulfs all!"),
                            new Quote("dragon_anger_2.wav", "Feel the gust of the dragon's wings."),
                            new Quote("dragon_anger_3.wav", "Fiery roar echoes through the skies."),
                            new Quote("dragon_anger_4.wav", "Inferno sweep, a blaze of draconic fury."),
                            new Quote("dragon_anger_5.wav", "Eternal soar, the dragon's wings carry our love.")
                    },
                    new Quote[]{
                            new Quote("dragon_seduce_1.wav", "Our love roars with the fury of the dragon!"),
                            new Quote("dragon_seduce_2.wav", "Fly with me on the wings of eternal passion."),
                            new Quote("dragon_seduce_3.wav", "Fiery roar, a symphony of draconic affection."),
                            new Quote("dragon_seduce_4.wav", "Inferno sweep, the flames of our love burn bright."),
                            new Quote("dragon_seduce_5.wav", "Eternal soar, our love transcends the highest peaks.")
                    });
        };
    }
} // audio needed for Dragon, Kraken, Phoenix, Wyvern, Chimera, Harpy, Creeper, Mummy




