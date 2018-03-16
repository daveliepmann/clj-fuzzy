(defproject clj-fuzzy "0.4.2-SNAPSHOT"
  :description "A handy collection of algorithms dealing with fuzzy strings and phonetics."
  :url "http://yomguithereal.github.io/clj-fuzzy/"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.9.854"]]}}
  :plugins [[lein-kibit "0.0.8"]
            [lein-cljsbuild "1.0.6"]]
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "src-js/build.js"
                                   :optimizations :advanced}}]})
