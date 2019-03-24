(ns waffles.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [waffles.core-test]))

(doo-tests 'waffles.core-test)
