(import '[java.text SimpleDateFormat]) 
(import '[java.sql Timestamp]) 

;; timelong is the long int time seconds 
(defn timestamp2date [timelong] 
(.toString (Timestamp. timelong))) 

;; date is date string 04/16/2012 
(defn date2timestamp [date] 
(.getTime (.parse (SimpleDateFormat. "MM/dd/yyyy") date)))

(println (timestamp2date 1356684020392))
