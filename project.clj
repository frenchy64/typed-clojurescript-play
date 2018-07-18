(defproject typed-clojurescript-play "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.typed.cljs "0.5.4-SNAPSHOT"]
                 [org.clojure/clojurescript "1.10.373"]]
  :plugins [[lein-typed "0.4.6"]]
  :source-paths ["src/clj"
                 "src/cljs"]
  :core.typed {:check []
               :check-cljs [cljs-play.ann
                            #_cljs-play.dom
                            #_cljs-play.helpers
                            #_cljs-play.identity]}
  :profiles {:dev {:dependencies [[cider/piggieback "0.3.6"]
                                  [org.clojure/tools.nrepl "0.2.13"]]
                   :repl-options {:port 64427
                                  :nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})
