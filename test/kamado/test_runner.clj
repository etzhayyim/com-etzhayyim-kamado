(ns kamado.test-runner
  (:require [clojure.test :as t]
            [kamado.murakumo-test]
            [kamado.methods.test-carbon-balance]
            [kamado.methods.test-charter-gates]
            [kamado.methods.test-decommission-robot]
            [kamado.methods.test-dedup]
            [kamado.methods.test-ingest]
            [kamado.methods.test-kamado]
            [kamado.methods.test-purge-time]
            [kamado.cells.asset-observation.test-state-machine]
            [kamado.cells.decommission-plan.test-state-machine]
            [kamado.cells.decommission-robot.test-state-machine]
            [kamado.cells.feedstock-guard.test-state-machine]
            [kamado.cells.synthesis-control.test-state-machine]
            [kamado.cells.transition-bridge.test-state-machine]))

(def suites
  '[kamado.murakumo-test
    kamado.methods.test-carbon-balance
    kamado.methods.test-charter-gates
    kamado.methods.test-decommission-robot
    kamado.methods.test-dedup
    kamado.methods.test-ingest
    kamado.methods.test-kamado
    kamado.methods.test-purge-time
    kamado.cells.asset-observation.test-state-machine
    kamado.cells.decommission-plan.test-state-machine
    kamado.cells.decommission-robot.test-state-machine
    kamado.cells.feedstock-guard.test-state-machine
    kamado.cells.synthesis-control.test-state-machine
    kamado.cells.transition-bridge.test-state-machine])

(defn -main [& _]
  (let [{:keys [fail error]} (apply t/run-tests suites)]
    (when (pos? (+ fail error))
      (System/exit 1))))
