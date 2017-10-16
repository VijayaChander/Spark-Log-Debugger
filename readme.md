
![alt text](https://github.com/VijayaChander/SparkLogDebugger/blob/master/sd.JPG)



scDebugger>help
=========================================
Usage:
1. allApplicationIds
2. setApplicationId

         1. search "term"
         2. hosts         
         3. firstException         
         4. executors-hosts-partitions       
         5. disk-memory-usage         
         6. jobMetrics         
3. memoryUsed
4. exit

=========================================

scDebugger>allApplicationIds

Recent Spark Applications:

SNo|ApplicationID                 |Application Name           |Date&Time         
---|------------------------------|---------------------------|-------------------
1  |application_1502194777904_0001|SparkSQL::10.76.99.41      |2017-08-08 18:04:06
2  |application_1478683272833_2488|SparkSQL::10.76.99.41      |2017-08-08 15:34:20
3  |application_1478683272833_2398|Zeppelin                   |2017-08-08 15:32:52
4  |application_1478683272833_2489|Spark                      |2017-08-08 12:36:41
5  |application_1478683272833_2446|SparkSQL::10.76.99.41      |2017-08-02 14:44:15
6  |application_1478683272833_2487|SortingDataStreaming       |2017-07-31 15:21:30
7  |application_1478683272833_2486|SortingDataStreaming       |2017-07-28 21:09:21
8  |application_1478683272833_2485|SortingDataStreaming       |2017-07-28 19:50:36
9  |application_1478683272833_2484|SortingDataStreaming       |2017-07-28 19:49:19
10 |application_1478683272833_2483|SortingDataStreaming       |2017-07-28 19:46:23

scDebugger>setapplicationid application_1493795227502_5174

Application Id set to :application_1493795227502_5174

scDebugger>hosts

Executor ID|Host                        |Executor Info.Log Urls                                              
-----------|----------------------------|--------------------------------------------------------------------
driver     |10.123.234.150              |null                                                                
1          |bbsr02cloud05.ad.cluster.com|http://bbsr02cloud05.ad.cluster.com:8042/node/abc/stdout?start=-4096
2          |bbsr02cloud04.ad.cluster.com|http://bbsr02cloud04.ad.cluster.com:8042/node/abc/stderr?start=-4096

scDebugger>search Job Result

Search Result for Job Result

{"Event":"SparkListenerJobEnd","Job ID":0,"Completion Time":1505289545647,"Job Result":{"Result":"JobSucceeded"}}

{"Event":"SparkListenerJobEnd","Job ID":1,"Completion Time":1505289545763,"Job Result":{"Result":"JobSucceeded"}}

scDebugger>disk-memory-usage

Executor ID|Maximum Memory(MB)|Memory Used(MB)|Disk Spilled(MB)
-----------|------------------|---------------|----------------
1          |2120.0            |1968.0         |2670.0          
2          |2120.0            |2097.0         |2387.0          

scDebugger>executors-hosts-partitions

SNo|Executor Id|Host                        |Stage Id |Partition Id  
---|-----------|----------------------------|---------|--------------
1  |Executor(1)|bbsr02cloud05.ad.cluster.com|Stages :0|Partition: :17
2  |Executor(2)|bbsr02cloud04.ad.cluster.com|Stages :0|Partition: :18
3  |Executor(2)|bbsr02cloud04.ad.cluster.com|Stages :0|Partition: :19
4  |Executor(1)|bbsr02cloud05.ad.cluster.com|Stages :0|Partition: :20
5  |Executor(1)|bbsr02cloud05.ad.cluster.com|Stages :0|Partition: :21
6  |Executor(2)|bbsr02cloud04.ad.cluster.com|Stages :0|Partition: :22
7  |Executor(2)|bbsr02cloud04.ad.cluster.com|Stages :0|Partition: :23
8  |Executor(1)|bbsr02cloud05.ad.cluster.com|Stages :0|Partition: :24
9  |Executor(1)|bbsr02cloud05.ad.cluster.com|Stages :0|Partition: :25
10 |Executor(2)|bbsr02cloud04.ad.cluster.com|Stages :0|Partition: :26

scDebugger>memoryUsed

SNo|App Id                        |Resources            |Used Resources         |num of Containers|Cluster                 
---|------------------------------|---------------------|-----------------------|-----------------|------------------------
1  |application_1478683272833_2220|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160
2  |application_1478683272833_2220|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160
3  |application_1478683272833_2231|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160
4  |application_1478683272833_2231|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160
5  |application_1478683272833_2231|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160
6  |application_1478683272833_2231|memory:45056,vCores:1|memory:677888,vCores:17|numContainers=17 |memory:768000,vCores:160
7  |application_1478683272833_2231|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160
8  |application_1478683272833_2328|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160
9  |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160
10 |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160

============== Job Metrics ==============

Usage:

1. Application
2. Job
3. Stage
4. Task
5. Exit

=========================================

Enter an option listed above to view specified metrics : 1

App Name    |App ID                        |User |Submission Time    |Completion Time    |Duration(min)
------------|------------------------------|-----|-------------------|-------------------|-------------
sparkProject|application_1493795227502_5174|abc  |2017-09-13 13:24:36|2017-09-13 13:29:05|4.49         

============== Job Metrics ==============

Usage:
1. Application
2. Job
3. Stage
4. Task
5. Exit

=========================================

Enter an option listed above to view specified metrics : q

============== Job Metrics ==============

Usage:
1. Application
2. Job
3. Stage
4. Task
5. Exit

========================================

Enter an option listed above to view specified metrics : 2

Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :

Job IDs : 0,1

Enter an option or type "q" to quit Job metrics :0

Job ID|Submission Time    |Completion Time    |Duration(min)|Stage IDs|Job Status  
------|-------------------|-------------------|-------------|---------|------------
0     |2017-09-13 13:24:42|2017-09-13 13:29:05|4.38         |[0, 1]   |JobSucceeded

Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :

Job IDs : 0,1

Enter an option or type "q" to quit Job metrics :ALL

Job ID|Submission Time    |Completion Time    |Duration(min)|Stage IDs|Job Status  
------|-------------------|-------------------|-------------|---------|------------
0     |2017-09-13 13:24:42|2017-09-13 13:29:05|4.38         |[0, 1]   |JobSucceeded
1     |2017-09-13 13:29:05|2017-09-13 13:29:05|0.0          |[2]      |JobSucceeded

Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :

Job IDs : 0,1

Enter an option or type "q" to quit Job metrics :q

=================== Ending Job Metrics ===================

============== Job Metrics ==============

Usage:

1. Application
2. Job
3. Stage
4. Task
5. Exit

=========================================

Enter an option listed above to view specified metrics : 3

Enter any stage ID listed below to view specific stage metrics or enter "ALL" to view all the stages :

Stage IDs : 0,1,2

Enter an option or type "q" to quit stage metrics :2

==========Metrics for Stage ID: 2============

Stage ID                  : 2

Stage Name                : show at SparkHive.scala:28

Stage Attempt ID          : 0

Number of Tasks           : 1

Submission Time           : 2017-09-13 13:29:05

Completion Time           : 2017-09-13 13:29:05

Duration(min)             : 0.0

JVM GC Time               : 0

Shuffle Write Time        : null

Result Serialization Time : 6

Shuffle Bytes Written     : null

Result Size               : 24325

Shuffle Records Written   : null

Executor Deserialize Time : 12

Total Records Read        : null

Executor Run Time         : 11


=======================================================

Enter any stage ID listed below to view specific stage metrics or enter "ALL" to view all the stages :

Stage IDs : 0,1,2

Enter an option or type "q" to quit stage metrics :ALL

=========== Metrics for all Stages ===========

Stage ID                  : 0

Stage Name                : count at SparkHive.scala:27

Stage Attempt ID          : 0

Number of Tasks           : 78

Submission Time           : 2017-09-13 13:24:42

Completion Time           : 2017-09-13 13:29:05

Duration(min)             : 4.38

JVM GC Time               : 13699

Shuffle Write Time        : 177374813

Result Serialization Time : 8

Shuffle Bytes Written     : 3276

Result Size               : 9100284

Shuffle Records Written   : 78

Executor Deserialize Time : 4078

Total Records Read        : null

Executor Run Time         : 1016486




Stage ID                  : 1

Stage Name                : count at SparkHive.scala:27

Stage Attempt ID          : 0

Number of Tasks           : 1

Submission Time           : 2017-09-13 13:29:05

Completion Time           : 2017-09-13 13:29:05

Duration(min)             : 0.0

JVM GC Time               : 0

Shuffle Write Time        : null

Result Serialization Time : 8

Shuffle Bytes Written     : null

Result Size               : 1951

Shuffle Records Written   : null

Executor Deserialize Time : 21

Total Records Read        : 78

Executor Run Time         : 71



Stage ID                  : 2

Stage Name                : show at SparkHive.scala:28

Stage Attempt ID          : 0

Number of Tasks           : 1

Submission Time           : 2017-09-13 13:29:05

Completion Time           : 2017-09-13 13:29:05

Duration(min)             : 0.0

JVM GC Time               : 0

Shuffle Write Time        : null

Result Serialization Time : 6

Shuffle Bytes Written     : null

Result Size               : 24325

Shuffle Records Written   : null

Executor Deserialize Time : 12

Total Records Read        : null

Executor Run Time         : 11


==================================================

Enter any stage ID listed below to view specific stage metrics or enter "ALL" to view all the stages :

Stage IDs : 0,1,2

Enter an option or type "q" to quit stage metrics :q

========Ending Stage Metrics==========

==========Job Metrics ==========

Usage:

1. Application
2. Job
3. Stage
4. Task
5. Exit

=================================

Enter an option listed above to view specified metrics : 4

Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :

1. Executor ID
2. Host
3. Attempt
4. Locality
5. Launch Time
6. Finish Time
7. Duration(min)
8. Disk Bytes Spilled
9. Executor Deserialize Time
10. Executor Run Time
11. Bytes Read
12. Records Read
13. JVM GC Time
14. Memory Bytes Spilled
15. Result Serialization Time
16. Result Size
17. Fetch Wait Time
18. Local Blocks Fetched
19. Local Bytes Read
20. Remote Blocks Fetched
21. Remote Bytes Read
22. Total Records Read
23. Shuffle Bytes Written
24. Shuffle Records Written
25. Shuffle Write Time
26. Speculative
27. Task Type
28. Task Status

Enter an option or type "q" to quit task metrics :4

Task ID|Locality     
-------|-------------
0      |NODE_LOCAL   
1      |NODE_LOCAL   
2      |NODE_LOCAL   
3      |NODE_LOCAL   
4      |NODE_LOCAL   
5      |NODE_LOCAL   
6      |NODE_LOCAL   
7      |NODE_LOCAL   
8      |NODE_LOCAL   
9      |NODE_LOCAL   
10     |NODE_LOCAL   

Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :

1. Executor ID
2. Host
3. Attempt
4. Locality
5. Launch Time
6. Finish Time
7. Duration(min)
8. Disk Bytes Spilled
9. Executor Deserialize Time
10. Executor Run Time
11. Bytes Read
12. Records Read
13. JVM GC Time
14. Memory Bytes Spilled
15. Result Serialization Time
16. Result Size
17. Fetch Wait Time
18. Local Blocks Fetched
19. Local Bytes Read
20. Remote Blocks Fetched
21. Remote Bytes Read
22. Total Records Read
23. Shuffle Bytes Written
24. Shuffle Records Written
25. Shuffle Write Time
26. Speculative
27. Task Type
28. Task Status
Enter an option or type "q" to quit task metrics :12

Task ID|Records Read
-------|-------------
0      |1141365     
1      |1148933     
2      |1128441     
3      |1126880     
4      |1138937     
5      |1135880     
6      |1151384     
7      |1134983     
8      |1152070     
9      |1155912     
10     |1167340     

Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :

1. Executor ID
2. Host
3. Attempt
4. Locality
5. Launch Time
6. Finish Time
7. Duration(min)
8. Disk Bytes Spilled
9. Executor Deserialize Time
10. Executor Run Time
11. Bytes Read
12. Records Read
13. JVM GC Time
14. Memory Bytes Spilled
15. Result Serialization Time
16. Result Size
17. Fetch Wait Time
18. Local Blocks Fetched
19. Local Bytes Read
20. Remote Blocks Fetched
21. Remote Bytes Read
22. Total Records Read
23. Shuffle Bytes Written
24. Shuffle Records Written
25. Shuffle Write Time
26. Speculative
27. Task Type
28. Task Status

Enter an option or type "q" to quit task metrics :q

=========Ending Task Metrics============

=======Job Metrics========

Usage:

1. Application
2. Job
3. Stage
4. Task
5. Exit

===============================

Enter an option listed above to view specified metrics : 5

========Ending Job Metrics=========

scDebugger>help

===========================

Usage:
1. allApplicationIds
2. setApplicationId

         1. search "term"
         2. hosts
         3. firstException
         4. executors-hosts-partitions
         5. disk-memory-usage
         6. jobMetrics             
3. memoryUsed
4. exit

=============================

scDebugger>exit

=========Ending session ===========
