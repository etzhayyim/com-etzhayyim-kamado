# kamado 竈 — Maturity

Stage: transition/decommission R0. Closed-loop carbon synthesis is admissible only
with screened non-fossil feedstock and a net atmospheric delta at or below zero;
legacy refinery assets are observation/decommission targets, never restart targets.

| Dimension | State |
|---|---|
| Lexicons | 6 canonical semantic EDN; Datomic projections and wire JSON separated |
| Runtime | canonical CLJC methods + 7 cell state machines |
| Tests | 78 tests / 244 assertions / 0 failures (2026-07-18) |
| Audit | EDN syntax, lexicon pairing, wire boundary, deprecated artifact exclusion |

Live actuation remains Council/ADR-gated. The standalone implementation performs
offline analysis, deterministic migration, dry-run transition planning, and signed
decommission entry planning only.
