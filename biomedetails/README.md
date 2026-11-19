# Biome Details (NeoForge 26.3)

Copia la carpeta `src/` dentro de tu proyecto MDK (mezclando con la existente) y borra el `ExampleMod` del MDK.
Si tu MDK ya trae `neoforge.mods.toml`, conserva el tuyo (loaderVersion, etc.) y solo pon `modId = "biomedetails"`.

## Que hace
1. Hongos de estante (shelf_mushroom) en arboles de `forest` y `old_growth_birch_forest`
   (arboles en pie y caidos). Probabilidad del decorador `shelf_mushroom` en los archivos `*_shelf.json` de `worldgen/feature`: 0.20 en pie / 0.50 caidos (los poplar vanilla usan 0.4 / 0.8).
2. `biomedetails:frozen_bush`: arbusto con la mitad superior nevada, en `snowy_plains` y `snowy_taiga`.
3. `biomedetails:purple_wildflowers`: wildflowers moradas en `taiga` y `old_growth_spruce_taiga`.

No usa TerraBlender: todo va con biome modifiers de NeoForge (data/biomedetails/neoforge/biome_modifier).
Para anadir mas biomas, edita la lista "biomes" del modifier correspondiente.
