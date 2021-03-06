# Village Defense Changelog

Changelog is followed by special scheme which is required in order to allow automatic discord
deploy webhooks to print changelog successfully

## Log scheme
`### <current version from pom.xml> <anything else here>`
`<update log line>`

That's all, matcher will stop when detects next line started with `###` match

### 4.4.1 Release 
* Fixed leave item events not working
* Added missing string to default bungee.yml
* Fixed new messages from last update
* Tried to fix parties
* Added back all messages to language.yml (Upgrades and Holograms)

### 4.4.0 Release (23.01.2020 - 18.03.2020)
* Added new Zombie VillagerBuster (wave 15 and up)
* Fixed zombie PlayerBuster & GolemBuster
* Fixed spectator can hit zombie_buster zombies
* Changed Event priority to work with CMI
* Fixed 1.15 Material issue
* Fixed upgrade messages are not added to language.yml
* PlaceholderAPI placeholders are no longer case sensitive
* Added arena state placeholders for PlaceholderAPI:
   * %murdermystery_{arena id}:{data}% where data types are:
      * players - amount of players in arena
      * max_players - max players in arena
      * state - current state raw enum name eg. STARTING
      * state_pretty - prettified name of enum eg. Waiting (instead WAITING_FOR_PLAYERS)
      * mapname - name of arena map
* Fixed mysql database - Create a new one and your stats should be saved correctly
* Fixed inventory bug
* Fixed incompatibility with UltimateStacker and similar 
* Added party dependency, you can join with more players to one arena
* Moved adding games played to ending stage
* Fixed spectators can use menu item in next round
* Fixed startup error after activating Upgrades/Holograms 
* Added Connect-To-Hub boolean to bungee.yml
* Added End-Location-Hub boolean to bungee.yml

### 4.3.1 Hotfix (13.12.2019)
* Arena will not be stopped anymore on starting phase when there are null players (only resetting it to waiting for players)
* Added 1.15 compatibility 

### 4.3.0 Release (01.11.2019 - 04.12.2019)
* The map will now remove dropped items & orbs after game finish
* Fixed some bugs that trigger events on physical action (for example spectator gui opens on redstone block)
* Fixed fast respawn bug
* Now players can´t interact with armorstands when they are in the arena
* Now players can´t destroy itemframes, paintings, and armorstands when they are in the arena
* Fixed SpectatorItemEvent not loaded, now spectator items will work on click
* Fixed special items stage loading is always lobby
* Fixed leave special items not working
* Added difficulty validator
* Fixed a lot of projectiles that could damage villagers, golems and wolfs (for example Fireball, FishHook, Trident)
* Fixed the NoSuchMethodException on arena signs load when the sign isn´t a wallsign  
* Fixed sign deletion is on the wrong path (now you can delete signs, that get really removed)
* Fix plugin crash when you forgot a value in specialitems file
* Clearer way of error reporting
* Fix alive player heads texture
* Removed Modules (Integrated all in one)
* Changed the MOTD Manager

### 4.2.2 Release (14.06.2019 - 13.07.2019)
* Fixed setup menu completed/not completed values were buggy
* Fixed /vda setprice message was sent twice
* Now shop will count wolf/golem spawn items to total price spent in game in game summary
* Join permission message outputs required permission node now
* Fixed bungee failed to add players after the game if shutdown on game finish was disabled
* Implemented modules - more info needed
* Stripped plugin from BungeeCord in favor of Bungee Cord Module
* Stripped plugin from /vd randomjoin command in favor of RandomJoin Module
* Stripped plugin from Wolves/Golems upgrades in favor of Entities Upgrades Module
* **Implemented modular system to handle addons for VillageDefense, code was split into modules that can
be downloaded from our repository page or in game GUI**
* Redesigned lobby items into special_items, they are now fully customizable by player not hardcoded like they were before
(it includes spectator items and kit selector), check special_items.yml for more
* VillagePlayerChooseKitEvent now reacts to event#isCancelled() method and won't give player kit if event is cancelled
(did give always before)
* Added 1.14 sign game states (thanks to montlikadani)
* Changed Chinese (Simplified) locale prefix from zh to cn
* Locales with special characters like Russian or Korean will now work properly and won't be seen as `?` characters

### 4.2.1 Release (25.05.2019 - 08.06.2019)
* Fixed possible issues with scoreboard colors
* Fixed boss bar displayed game end message not waiting for players after game restart
* /vda reload command is no longer discouraged and does reload config and language files
* Fixed MySQL possible leaks problem
* Fixed PlaceholderAPI placeholders on in-game scoreboard didn't work
* Fixed locales couldn't be loaded without locales folder
* Fixed locales would throw errors if accessed message that doesn't exist
* Game will no longer throw errors if boss bar is disabled
* When breaking doors zombies will generate other particles now and wil generate them on 1.13 and 1.14 (couldn't before)
* You will now receive additional message when adding zombie/villager spawns that 2 is minimum spawns amount so you can add more
* Totally recoded arena setup gui UI and code structure, now all changes applies to arena instantly
* Arena setup map name option now is chat based not name tag based
* Added shift + right click to delete all zombie/villager/door spawns (useful if you made a mistake, better than nothing)
* Added sign spawn protection radius warning, non opped players can't join via signs if sign is in radius of spawn protection
* Plugin will actually react for `/vd help` or `/vda help` commands now

### 4.2.0 Release (28.04.2019 - 17.05.2019)
   * Blocker kit no longer has very long lore in barrier item and no longer receives separate barrier item on restock
   * Implemented Messages enum and messages integrity check to validate that all messages in language.yml file
   are set properly, this is purely code based change to decrease chance of broking the plugin by doing a typo
   in new messages added to plugin, centralized class will perform better size of this project
   > Beta 2
   * Got working 1.14 build
   * Dog Friend and Golem Friend classes will spawn entities in 1.14 now
   * Fixed MySQL connection leak issues with VD API and Leaderboard command
   * Sounds on 1.14 are working properly now, no more exceptions
   * Sign game states are disabled on 1.14 for now
   > Beta 1
   * Relocate Plajer's Lair Services and TigerHix's ScoreboardLib packages in order to avoid conflict between our minigames if used on same server
   * Fixed data save on disable while using MySQL
   * /vda delete and /vda reload requires confirmation before execution now, you must type the command twice to confirm
   * Fixed update notify message was sent to everybody without proper permission check
   * Implemented HikariCP as a database connection pool library, it's better and jar size went 3 times smaller
   * First time database creation is now made async not in main server thread
   * Fixed item lores from shop as got cropped, only price line should
   > **Not working things in 1.14:**
   * After in-game death you don't get instant respawn
   * Sign game states are disabled
   * Entities aren't ridable

### 4.1.3 Release (06/25.04.2019)
* Fixed [#611 exception when there was no section for some rewards](https://www.plajer.xyz/errorservice/viewer.php?id=611) but plugin attempted to register them
* Fixed experience saving via InventoryManager
* Fixed plugin couldn't start up when Cloudflare was blocked in your country (or services were offline)
* Removed locale suggester if English one was enabled, locales were implemented long time ago and everyone knows about it
now so we don't need to remind about them anymore
* Removed hiding/showing players outside/inside arenas, now all players will be visible to everyone, this thing was bit buggy
and sometimes player were invisible to each other after a game so it's deleted
* Now you'll receive confirmation message when doing /vda stop
* Fixed leveled kits didn't work because permission was `villagefense` not `villagedefense`
* Iron golems on death won't drop items anymore
* Added better descriptions to setup options in setup menu [(uservoice suggestion)](https://uservoice.plajer.xyz/index.php?id=VillageDefense&view=22)
* Zombies were introduced with new pathfinder and forced overwrite of follow range attribute, they won't be stuck in the spawn point any longer

### 4.1.2 Release (15/27.03.2019)
* Leaderboard command doesn't include XP statistic in tab completion now
* Added April Fool's Day special effects, arrows sometimes can shoot at random direction
and villagers can sometimes drop diamonds at random velocity on death
* Fixed shop didn't load if items in chest if any item didn't have lore

### 4.1.1 Release (13/14.03.2019)
* Added Russian locale (thanks to POEditor contributors!)
* Fixed zombies couldn't even spawn in any arena

### 4.1.0 Release (14.02.2019 - 10.03.2019)
* Abandoned the direct try-catch exception handling in most of methods and event listeners in favour of
logger listening, code looks better now
* Fixed Signs weren't updating if Signs-Block-States-Enabled option was false

### 4.0.4 Release (10.02.2019)
* Added Valentine's Day effects like heart arrow trails and special healing power-up

### 4.0.3 Release (01/08.02.2019)
* Fixed NPE when rewards section was null [#449](https://plajer.xyz/errorservice/viewer.php?id=449)
* Prettified golem upgrades particle effects a bit
* Implemented new scoreboard system, faster and non flicker
* Fixed NPE when typing /vda setwave without number [#474](https://plajer.xyz/errorservice/viewer.php?id=474)
* Added Lithuanian and Portuguese Brazilian locales (thanks to POEditor community!)

### 4.0.2 Release (23.01.2019)
* Fixed [#415 error](https://plajer.xyz/errorservice/viewer.php?id=415) caused by /vda setprice without price set
* Removed return code line from onDisable method while saving user data into mysql, only 1 stat was saved for 1 player -,-

### 4.0.1 Release (18/19.01.2019)
* There was no check for max tier of entity upgrades, you could upgrade tier 5 infinitely
* Fixed error #409 caused by Golem's Final Defense upgrade (https://plajer.xyz/errorservice/viewer.php?id=409)
* Added new pro tip about user voice panel https://plajer.xyz/uservoice/index.php?id=VillageDefense
* Added tip about special items for shops when setting up shop via setup menu
* Fixed errors when plugin was disabled and arenas couldn't be properly reset

### 4.0.0 Release (04.10.2018-17.01.2019)
**Whole changelog from all beta pre releases**
* Limited rotten flesh hearts level amount to 30 after this limit you won't receive any more hearts
* Added zombie idle process to save server load and prevent lag, when game will be in higher waves state system will
run idle process to halt spawning zombies to x seconds (wave / 15 rounded down) so server will save performance a bit
* Added zombie spawn limiter, now there won't be more than 750 zombies in wave, any amount above that will be
decremented to 750 and zombies will gain extra health based on algorithm (zombies this wave - 750 / 15 rounded up)
* Now if there will be spawned more than 70 zombies and player uses /vda setwave or /vda clear zombie commands or uses 
cleanup power-up or cleaner kit every third zombie will spawn lava particles to prevent client lag
* The game will now cleanup all rotten fleshes spawned near 150 blocks from starting location of arena after the game ends
* Implemented better power-up registry for better API hooks
* Fixed dead users won't be respawned when game starts
* Added tab completer for some commands values
* Beta pre 6 (14.12.2018-12.01.2019)
    * Implemented legacy data fixer that will fix inconsistency between original user data and current one (old implementation failure)
    data was wrongly saved without getName() method called. MySQL users are safe.
    * Added Italian locale
    * Fixed arena signs were incorrectly saved via setup menu (4.0.0 pre issue)
    * Fixed /vda forcestart wasn't working properly when there were not enough players to start
    * In case of any server crash players' inventories will be loaded from backup if exist in inventories folder in Village Defense plugin folder
    * Removed permissions for giving other players levels for commands /vda setlevel/addlevel (it was useless)
    * Debug messages "Some doors has failed to load for arena" for 1.11 and 1.12 was fixed, doors were loaded properly
    * Removed weird villagers behavior that they were still spawned even if game was finished, it was intended but we removed it
    * Added caching reflection while spawning game entities, this change drastically decreases plugin load and average plugin speed per tick is now faster
    * Fixed worlds were generated if arenas.yml contain their names (PLCore issue)
    * Misc code improvements - signs refresh speed improved and other things
    * Now zombies or any other entities that will damage any other entity won't be registered into user database
    * Now language manager will use cached language.yml file so plugin will perform bit better
    * Now you can smoothly add/decrease minimum and maximum players amount in setup gui
    * Added useSSL=false argument in mysql.yml address to avoid mysql warnings in console (not harmful)
    * Fixed Worker kit wasn't displaying and working on 1.11-1.12
    * Fixed oak doors couldn't be placed at the position of broken ones on 1.11-1.12
    * Fixed doors couldn't be broken by zombies at 1.11-1.12
    * Fixed doors couldn't be added in arena setup at 1.11-1.12
    * Buffed and nerfed cleaner kit, can use his ability each 60 seconds but will clean only spawned zombies not all in wave
    * Nerfed map cleaner powerup it will clean only spawned zombies now 
    * Added message when player receive orbs via addorbs command
    * Golems on death won't drop useless items now
    * Added missing game prefixes in some commands
    * Added /vda clear wolf to /vda clear command. You can now clear wolves
    * Totally new entity upgrade system implemented!!!
    * Fixed game couldn't clean up and save users data on disable when mysql was enabled (usually on force disable)
* Beta pre 5 (1.12.2018)
    * Fixed commands without permissions weren't working
    * Fixed setup inventory not working
* Beta pre 1-4 (04.10.2018 - 27.11.2018)
    * API change - now you can path it via pl.plajer.villagedefense.api
    * Removed actionbar message from players that died and the arena was changed in "ending"
    * Fixed https://plajer.xyz/errorservice/viewer.php?id=245
    * Added spectator settings menu (now working)
    * You cannot join now game infinitely through command (lol???)
    * Now players that leave game will be visible by other players outside game
    * Nerfed some kits - potions amplifiers are counted from 0 so every kit with potion effects has now amplifier -1 because it was too op
    * Implemented powerup registry
    * Fixed weird respawn glitches (player was - bugged half dead)
    * Zombies after respawn won't stay and don't move until you attack them
    * Added halloween effects (can be disabled in config) (4 days before and 4 days after Halloween)
    * Added wave limiter
    * Added command vda add/set levels
    * Now non localized Spawn Golem/Wolf items will work with locales
    * Added tip about downloadable maps when no arenas are set up while typing /vda list
    * Added tab completer for /vd join <arena name>
    * Fixed broken game logic while spawning zombie entities, Villager Slayer never spawned in game neither knockback resistant
    ones - game may be now much harder sorry :(
    * Cleaned up lots of code - especially commands and setup inventory
    * Now commands like /vda addorbs/setlevel/setwave won't throw an error if number exceeds real Integer max value
    (2 147 483 647) - some users brute forced this error using values like 300000000000000000 (fixes https://plajer.xyz/errorservice/viewer.php?id=351)
    * More setup tips!
    * Implemented JavaScript engine into rewards section. Now you can execute java code from rewards.
    * Fixed exp wasn't saved properly via InventoryManager

### 3.11.5 Release (28.09.2018/04.10.2018)
* Fixed server was stopped using Shutdown-When-Game-Ends option but player just left not started arena
* Fixed NPE when chest location wasn't set (https://plajer.xyz/errorservice/viewer.php?id=232)
* Fixed debugger messages like `[Village Debugger] Some doors has failed to load for arena VD2! Expected 8 but loaded only 9!`, was x + 1
* Code improvements
* Removed annoying "Please enable bStats" message for admins
* Now when update cannot be checked you won't receive any message like "Cannot check for updates!"
* Added PAPI placeholders support in in-game chat!
* Added some PR0 TIPS when editing arenas
* Fixed NPE for migrator (https://plajer.xyz/errorservice/viewer.php?id=240)

### 3.11.4 Release (25/26.09.2018)
* Fixed rewards weren't dispatched properly while using %PLAYER% placeholder (it was always executed by players)
* Fixed endwave commands not working
* Fixed signs not working
* Fixed doors will not destroyed
* Removed bad behavior when you was teleported to arena ending location while joining the server on the arena world
* Brought back game sign states
* Setup video link in setup menu is now working properly :)

### 3.11.3 Release (07/23.09.2018)
* Dropped 1.9-1.10 support
* /vda reload now force players to quit to prevent problems
* Now shop will be successfully registered when arena is freshly created
* Added villagedefense.command.override permission to be able to use all game commands while being in VillageDefense game
* Added cancel lobbystart when there are not enough players
* Added checking if player is in the same arena as spectator
* Fixed permission typo with respawn others for villagedefense.admin.*
* Added /vda reload permission for villagedefense.admin.*
* Added xp bar countdown in lobby
* Fixed IAE when shop was null (https://plajer.xyz/errorservice/viewer.php?id=209)
* Fixes for 1.13
* Updated setup video link and added it into setup menu
* Powerups won't be enabled on 1.13 now even if Holo Displays is installed, latest plugin version doesn't work with pickup handler api
* Compass for spectators is now properly given on death
* Leave item for died spectators is now working
* Arena registry is now fail safe, not existing sections won't throw errors in console now
* Fixed ClassCastException errors in console when non player sender executed game commands (ex. command block, different player implementation)
* Sounds on 1.13 are now working properly (without errors and can be heard now)
* Door crack particles cannot be seen at 1.13 for now

### 3.11.2 Release (03.09.2018)
* Temporarily merged PLCore to fix issues when using my other plugins

### 3.11.1 Release (01.09.2018)
* Fixed update checker bugs while using my other mini games
* Fixed errors in console for 1.13 - sounds problem

### 3.11.0 Release (19/26.08.2018)
* Now removing invalid players in game when getPlayers() method is invoked
* Fixed NullPointerException for users who were no longer online
* Some code improvements
* Added dynamic locale manager system - you can now get latest locales on demand from our repository
* Added Romanian locale
* Added 1.13.1 support
* Fixed scoreboard color bugs (see https://i.imgur.com/kaZy5s2.png)
* Fixed this bug https://github.com/Plajer-Lair/Village_Defense/issues/10
* Some MySQL improvements
* Moved some bad console messages to debugger
* Some small fixes for errors from Error service
* Added PlaceholderAPI placeholders support in scoreboard

### 3.10.1 Release (13/17.08.2018)
* Fixed NullPointerException in combust event (reported anonymously via Error service) (#1 error service report)
* Fixed IndexOutOfBoundsException in join event while bungee is enabled (reported anonymously via Error service) (#2 error service report)
* Added configurable time between next waves (for example for implementing custom bosses using wave end rewards :))
* Fixed NullPointerException in add orbs other method in vda command (reported anonymously via Error service)
* Fixed NullPointerException while using setup menu while using my other minigames (like BuildBattle) (reported anonymously via Error service)
* Fixed NumberFormatException for language.yml migrator - this problem is very rare to occur but it was reported so fix was done
* Some 2 other small fixes for errors that MAY be fixed (and may not)

### 3.10.0 Release (08.08.2018)
* Built against PLCore API
* Fixed MySQL error when creating it for first time
* Fixed error in 1.9 versions in game
* Updated German locale
* Dropped WorldEdit support

### 3.9.2 Release (03.08.2018)
* Fixed InventoryManager errors due to scoreboard saving in it
* Updated French and Hungarian locales

### 3.9.1 Release (26.07.2018)
* Fixed Unknown Player bug in /vd top while using database (now user names are stored in database)
(will take a while until all Unknown Player records will be changed to Player names cause they are overridden every quit event)
* Fixed Vietnamese locale
* Fixed 1.13 not working
* Fixed /vd command wasn't working in game
* Added scoreboard saving in inventory manager
* Added Chinese (Simplified) locale support
* Fixed /vd randomjoin wasn't working

### 3.9.0 Release (16/17.07.2018)
* Added support for 1.13-pre7
* Removed deprecated commands (/vda setshopchest and /vda addsign) - they were deprecated and not working
* Updated locales messages
* Added /vd randomjoin command for multi arena server
* Added info when setting empty shop chest
* Added 1.10 support
* Optimized code a bit

### 3.8.2 Release (12.07.2018)
* Bring back Vietnamese locale support

### 3.8.1 Release (02.07.2018)
* /vd top command and other not working /vd commands will now work in game
* Dropped Vietnamese locale as this translation was in 50% of English messages...
* Fixed locales loading not working, plugin wasn't even enabled

### 3.8.0 Release (29.06.2018)
* API update - added new events: VillageGameStateChangeEvent, VillageGolemUpgradeEvent, VillagePowerupPickEvent and VillagePlayerStatisticChangeEvent
* Added orbs StatisticType to StatsStorage class (keep in mind that orbs stat is a temporary statistic for each game!)
* Added wolves and golems limit per player

### 3.7.6 Release (28.06.2018)
* Now you will see setup video link when creating new arena
* Using placeholder for golem upgrades cost to be corresponding to golem upgrades values from config.yml (makes locales more adaptive)
* Added Vietnamese localization support (thanks to POEditor contirbutors!)

### 3.7.5 Release (23/27.06.2018)
* Implemented Spanish, French and Indonesian localization support (thanks to POEditor contributors!)
* Updated other locales translations (thanks to POEditor contributors!)
* Added few more translatable admin messages (thanks to montlikadani for contribution!)
* Fixed NPE for 1.8 boss bar users

### 3.7.4 Release (22.06.2018)
* Implemented localization support via .properties files - more info later
* Added whitelisted commands configurable in config.yml
* Now admin commands won't be blocked via blocked commands in game
* Using default config values in case of config gets totally reset (somehow)

### 3.7.3 Release (14.06.2018)
* Fixed boss bar startup errors
* Removed usage of basic permission "arena edit"

### 3.7.2 Release (04.06.2018)
* Added sign block states of the game
* Added /vd selectkit command to select kit in game (permission villagedefense.command.selectkit)
* Fixed last Dark essence of Wizard kit wasn't removed when used
* Prettified commands now work properly at 1.9 and are available at 1.8
* Added BossBar for 1.8 versions

### 3.7.1 Release (25.05.2018)
* Full games permission now works for BungeeCord
* Can't combust villagers, iron golems and wolves now using flaming arrows

### 3.7.0 Release (23.05.2018)
* New modernized and customizable scoreboard
* /vda addsign is now deprecated, use Setup menu instead - changed due to some problems
* Now signs accept %state%, %players% etc placeholders in different lines! You can swap them how you want.
* Players with MVP and Elite permissions will be able to join full arenas now (only Vip permission worked)
* By default level kits were unlocked to operator players, now they won't
* Now spectators will not have night vision after respawn

### 3.6.3 Release (11/12.05.2018)
* Added tab completer
* Added did you mean to help with wrong commands (ex. /vd leaveve > Did you mean /vd leave?)
* Added line wrapping for blocker kit and some new comments in language.yml file
* Fixed #4 bug, mysql users should be aware of that problem especially users with cloud management systems
* Now removing boss bar of player when plugin gets disabled while games are on
* Re-commented rewards.yml file and added chance condition
* Overriding WorldGuard build deny flag which disallow Villager damage by zombies
* Fixed bug where flaming arrows from player could set on fire another player
* Reworked files migrator, now it will update config and language files without losing comments!

### 3.6.2 Release (04/10.05.2018)
* Fixed /vd create command without argument gave an error
* Added PlaceholderAPI support
* Fixed permissions for Worker and Blocker kits (villagedefense.kit.%kit name% wasn't working for them)
* Updated Java Docs and API for getting sorted statistics
* Fixed errors in console when offline player's wolves killed zombies
* Update notify permission for admins with villagedefense.admin.* added
* Now doors amount in setup menu will be normal (was 2x more because 1 door is 2 blocks)
* Fixed bug where power ups were staying in game even if we left it, now power ups will remove after 40 seconds after spawn
* Added /vd top <stat> command to show top 10 users!

### 3.6.1 Hotfix (04.05.2018)
* Fixed /vda command not working on 1.8

### 3.6.0 Release (04.05.2018)
* Code improvements
* Fixed another bug from early 2.x versions with cooldown drop faster depending on arenas number (ex. 2 arenas = 2 cooldown seconds less per second!)
* Wolves are rideable now
* Golems and wolves won't get drowned now, they can swim!
* Added new zombie spawning randomly in waves higher than 21! Villager Slayer.
* Fixed shotbow bow ability was working for every different kit
* Fixed /vd admin list command
* Prettified admin commands, now you don't need wiki for extended information about commands :)
* Fixed bug where you could throw any items to the secret well

### 3.5.0 Release (28.04.2018)
* Fixed #3 bug
* Fixed particles in 1.8
* Fixed files generation without comments
* Fixed TPS loss
* Now wizard staff's attack will damage zombie if zombie is in front of you (less than 1 block away)

### 3.4.0 Release (22.04.2018)
* Fixed major memory leak since 3.2.0
* Fixed setup errors on clean installation
* Fixed title message on death not displaying properly
* Fixed typo "plugin is up to date" instead of "plugin is outdated"

### 3.3.0 Release (20.04.2018)
* Added Powerups
* Fixed titles weren't displaying (bug since 2.1.x)
* Now removing potion effects from player after force server stop
* Organised code
* Enhanced Village Debugger
* Added generic VillageEvent event class

### 3.2.0 Release (1.04.2018)
* Small fix for plugin loading errors when dependencies weren't installed and plugin was disabled
* Using metadata for village defense entities
* Fixed permission villagedefense.join.<arena_name>
* Fixed client kick when trying to get spawn eggs
* Fixed compatibility with plugins like Citizens

### 3.1.3 Release (30.03.2018)
* Fixed zombies spawning warning in console (reported by transportowiec96)
* You can now ride villagers properly in 1.11
* Removed usage of /vda setshopchest command, now you can set shop chest via setup menu only
* Implemented iron golems riding in 1.8, 1.9 and 1.11 versions
* Improved Villagers pathfinders, now they will avoid zombies
* Fixed zombie kills stats counting
* Fixed zombie kills stats counting by wolves
* Fixed shop registering when reloading arenas via /vda reload

### 3.1.2 Release (28.03.2018)
* Fixed scoreboard issue

### 3.1.1 Release (28.03.2018)
* Fixed zombie kills stats counting X times on zombie death (based on created arenas size)
* Now wolf owner will get stat for killing zombie
* Optimized Tornado and Blocker kits schedulers (even if kits were unused)
* Buffed Archer kit's arrows amount per wave from 5 to 15
* Fixed small memory leak
* Fixed bStats new config generation in bStats/resources/ folder
* Improved auto respawn
* Added messages In-Game.Spectator.Target-Player-Health and Scoreboard.Footer
* Properly clearing player inventory when server is closed/plugin gets disabled
* Hypixelized plugin (sort of)
* Fixed some typos in setup menu
* Added night vision for spectators
* Fixed restart needed after shop was created

### 3.1.0 Release
* MAJOR EXPLOIT FIX - You could get rotten fleshes infinitely from secret well using freecam (Exploit since early 2.0 versions)
* Added permissions for signs creating and breaking
* Now you properly get Spectator menu on death
* Now players that join running arena gets bonus hearts that were added before from rotten fleshes

### 3.0.1 Release
* Fixed plugin startup error when using MySQL

### 3.0.0 Release
* Added game mode, saturation and flying state saving to Inventory Manager
* ZombieFinderKit fixes
* Some arenas fixes
* Fixed migrator (v2 > v3)
* Fixed arena registering via setup menu


