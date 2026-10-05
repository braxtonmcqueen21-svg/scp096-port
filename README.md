# SCP-096 port: SCP: Lockdown 1.12.2 (2.4.3) -> Forge 1.20.1

Standalone addon mod (modid `scp096port`). It runs next to SCP: Lockdown 1.20.1; it does not modify that jar.

## Build
1. Install JDK 17, then in this folder run `gradlew build` (or `gradle wrapper` first if there is no wrapper).
   Jar appears in `build/libs/`. Or copy `src/` into an existing 1.20.1 Forge MDK.
2. Drop the jar in `mods/`.

## Use
- Spawn: `/summon scp096port:scp096` or the SCP-096 spawn egg (Spawn Eggs creative tab).
- Look at its face (survival player, within 100 blocks, inside the face FOV, line of sight - glass doesn't block) -> it screams, sobs for 29 s, then hunts you.
- It stops when everyone on its kill list (max 3) is dead or in creative/spectator, then sits down again.
- Config: `config/scp096port-common.toml` (block breaking OFF/ON/SPECIFIC, sounds, face FOV, trigger on mobs).

## What is a faithful port, what is not
Faithful (read from the 1.12.2 bytecode): hitbox 0.9x1.9, 1024 HP, speed 0.29, follow range 100, damage 40, attack speed x2,
4 states, kill list (3), 29 s wind-up, 11 s scream loop, 35 s idle sobbing, block-breaking modes, all 4 pose models (every box/pivot/rotation/UV), both textures, all 4 sounds.
Not ported / my own choices: the original keyframe animation system (new simple procedural animation instead), natural spawning (egg/command only),
block-breaking default (SPECIFIC list of doors/glass/planks), hurt/death sound (uses the grunt), render scale 1.25 (from SCP096Anim.SCALE, assumed to be a visual scale).
Untested: not compiled against Forge or run in-game.

Assets/geometry come from SCP: Lockdown's authors - keep this for personal use unless you have their permission to redistribute.
