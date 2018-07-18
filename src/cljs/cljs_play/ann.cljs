(ns cljs-play.ann
  (:require [cljs.core.typed :refer [ann check-ns]]))

(ann foo number)
(def foo 1)
