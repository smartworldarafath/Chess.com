# Chess App Security Analysis & Source Decompilation

This repository contains reverse engineering analysis, decompiled sources, extracted assets, and security audit reports for the Chess app (`com.chess.apk`).

## Repository Contents

- `SECURITY_ANALYSIS.md`: Comprehensive security assessment and findings.
- `manifest.json`: Metadata & analysis inventory.
- `sources/`:
  - `decompile_cee/`: Decompiled CEE engine wrapper components.
  - `decompile_contacts/`: Decompiled contacts & invite features.
  - `decompile_uci/`: External UCI engine integration modules.
  - `decompile_webview/`: Web view controller & bridge components.
  - `dex_extracted/`: Extracted string definitions & type mappings.
  - `native_libs/`: Decompiled native `.so` libraries and reports (`libcee.so`, `libhermesvm.so`, etc.).
  - `res_out/`: Extracted APK resources, manifest, and assets.
  - `com.chess.apk.part1` & `com.chess.apk.part2`: Split parts of the original APK (due to GitHub's 100MB file size limit).
- `tools/`: Analysis binaries and decompilation tools (jadx, etc.).

## Reassembling the APK

To reassemble `com.chess.apk` from the split parts:

### Windows (CMD / PowerShell):
```cmd
copy /b sources\com.chess.apk.part1 + sources\com.chess.apk.part2 sources\com.chess.apk
```

### Linux / macOS:
```bash
cat sources/com.chess.apk.part1 sources/com.chess.apk.part2 > sources/com.chess.apk
```
