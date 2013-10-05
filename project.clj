(defproject typed-clojurescript-play "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.typed "0.2.13"]
                 [org.clojure/clojurescript "0.0-1859"]]
  :plugins [[lein-typed "0.3.1"]]
  :source-paths ["src/clj"
                 "src/cljs"]

  :core.typed {:check []
               :check-cljs [cljs-play.ann
                            #_cljs-play.dom
                            #_cljs-play.helpers
                            #_cljs-play.identity]}
  :profiles {:dev {:repl-options {:port 64427}}})
