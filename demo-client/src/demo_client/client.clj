(ns demo-client.client
  (:gen-class)
  (:require
    [protojure.grpc.client.providers.http2 :as grpc.http2]
    [com.example.addressbook.Greeter.client :as greeter]
  )
)

(defn -main
  [& args]
  (let [client @(grpc.http2/connect {:uri "http://localhost:8080"})]
  (println @(greeter/Hello client {:name "Janet Johnathan Doe"})
)))
