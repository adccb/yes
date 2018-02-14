(defn yes [arg]
  (while true 
    (println (or arg "y"))))

(yes (nth *command-line-args* 0))

