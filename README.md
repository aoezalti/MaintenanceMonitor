# MaintenanceMonitor
We are a small hydro-power electricity supplier near Vienna. Our customers expect electricity
around the clock with a service level agreement of 99.95%. This means that the maximum
outage of 21 minutes and 54 seconds (monthly in sum) is tolerated. It is easy to derive that
service times are very important to us. Huge monitors were installed that should show

• a green monitor in case everything looks fine and

• a red monitor in case of problems.

All monitors show the same content: a maximized website.

# Technical Details
REST-based server in Java using Spring Boot 2.7.1
