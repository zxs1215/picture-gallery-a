(ns picture-gallery-a.routes.home
  (:require [compojure.core :refer :all]
            [picture-gallery-a.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
