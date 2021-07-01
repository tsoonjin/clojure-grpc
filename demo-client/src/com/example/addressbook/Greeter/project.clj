(defproject protojure-tutorial "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2019
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]

                 ;; -- PROTOC-GEN-CLOJURE --
                 [protojure "1.5.11"]
                 [protojure/google.protobuf "0.9.1"]
                 [com.google.protobuf/protobuf-java "3.13.0"]
                 ;; -- PROTOC-GEN-CLOJURE HTTP/2 Client Lib Dependencies --
                 [org.eclipse.jetty.http2/http2-client "9.4.20.v20190813"]
                 [org.eclipse.jetty/jetty-alpn-java-client "9.4.28.v20200408"]
                 ;; -- Jetty Client Dep --
                 [org.ow2.asm/asm "8.0.1"]]
  :main  ^{:skip-aot true} demo-client.client
  :source-paths ["."])
