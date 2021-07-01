(defproject protojure-tutorial "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2019
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]

                 ;; -- PROTOC-GEN-CLOJURE --
                 [protojure "1.6.1"]
                 [protojure/google.protobuf "0.9.1"]
                 [com.google.protobuf/protobuf-java "3.13.0"]
                 ;; -- PROTOC-GEN-CLOJURE HTTP/2 Client Lib Dependencies --
                 [org.eclipse.jetty.http2/http2-client "11.0.5"]
                 [org.eclipse.jetty/jetty-alpn-java-client "11.0.5"]
                 ;; -- Jetty Client Dep --
                 [org.ow2.asm/asm "9.1"]]
  :main  ^{:skip-aot true} demo-client.client)
