
   ____               __         _       _
  / __/__   ___  ____/ /__    __/ /__   / /_     __   __   __   ____
  _\ \/ _ \/ _ `/ __/  '_/__ /__ //__\ /__ //  // _ \/ _ \/__\ / __/
 /___/ .__/\_,_/_/ /_/\_\   /__ / \__ /__ //__/ \_  /\_  /\__ /_/        version 1.0
    /_/                                         _/ / _/ /
                                                \_/  \_/

Using Scala 2.10.4 Java HotSpot(TM) 64-Bit Server VM Java 1.8.0_51
Type "help" for more information.


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
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+---+------------------------------+---------------------------------------------+-------------------+
|SNo|ApplicationID                 |Application Name                             |Date&Time          |
+---+------------------------------+---------------------------------------------+-------------------+
|1  |application_1502194777904_0001|SparkSQL::10.76.99.41                        |2017-08-08 18:04:06|
|2  |application_1478683272833_2488|SparkSQL::10.76.99.41                        |2017-08-08 15:34:20|
|3  |application_1478683272833_2398|Zeppelin                                     |2017-08-08 15:32:52|
|4  |application_1478683272833_2489|Spark                                        |2017-08-08 12:36:41|
|5  |application_1478683272833_2446|SparkSQL::10.76.99.41                        |2017-08-02 14:44:15|
|6  |application_1478683272833_2487|SortingDataStreaming                         |2017-07-31 15:21:30|
|7  |application_1478683272833_2486|SortingDataStreaming                         |2017-07-28 21:09:21|
|8  |application_1478683272833_2485|SortingDataStreaming                         |2017-07-28 19:50:36|
|9  |application_1478683272833_2484|SortingDataStreaming                         |2017-07-28 19:49:19|
|10 |application_1478683272833_2483|SortingDataStreaming                         |2017-07-28 19:46:23|
|11 |application_1478683272833_2482|SortingDataStreaming                         |2017-07-28 19:45:57|
|12 |application_1478683272833_2481|SortingDataStreaming                         |2017-07-28 19:35:42|
|13 |application_1478683272833_2480|SortingDataStreaming                         |2017-07-28 19:32:03|
|14 |application_1478683272833_2479|SortingDataStreaming                         |2017-07-28 19:20:42|
|15 |application_1478683272833_2478|SortingDataStreaming                         |2017-07-28 19:04:38|
|16 |application_1478683272833_2477|SortingDataStreaming                         |2017-07-28 16:07:44|
|17 |application_1478683272833_2476|SortingDataStreaming                         |2017-07-28 16:05:51|
|18 |application_1478683272833_2474|Spark                                        |2017-07-28 16:04:19|
|19 |application_1478683272833_2475|Spark                                        |2017-07-28 16:02:18|
|20 |application_1478683272833_2473|SortingDataStreaming                         |2017-07-28 15:56:01|
|21 |application_1478683272833_2472|SortingDataStreaming                         |2017-07-28 15:54:39|
|22 |application_1478683272833_2471|SortingDataStreaming                         |2017-07-28 15:53:41|
|23 |application_1478683272833_2470|SortingDataStreaming                         |2017-07-28 15:52:08|
|24 |application_1478683272833_2469|SortingDataStreaming                         |2017-07-28 15:45:11|
|25 |application_1478683272833_2468|SortingDataStreaming                         |2017-07-28 15:44:01|
|26 |application_1478683272833_2467|SortingDataStreaming                         |2017-07-28 15:37:45|
|27 |application_1478683272833_2466|SortingDataStreaming                         |2017-07-28 15:27:21|
|28 |application_1478683272833_2465|SortingDataStreaming                         |2017-07-28 15:25:42|
|29 |application_1478683272833_2464|Spark                                        |2017-07-28 13:06:03|
|30 |application_1478683272833_2463|SortingDataStreaming                         |2017-07-27 18:31:51|
|31 |application_1478683272833_2462|SortingDataStreaming                         |2017-07-27 18:16:57|
|32 |application_1478683272833_2461|SortingDataStreaming                         |2017-07-27 16:36:01|
|33 |application_1478683272833_2460|SortingDataStreaming                         |2017-07-27 16:30:17|
|34 |application_1478683272833_2459|SortingDataStreaming                         |2017-07-27 16:22:43|
|35 |application_1478683272833_2458|SortingDataStreaming                         |2017-07-27 16:18:41|
|36 |application_1478683272833_2457|SortingDataStreaming                         |2017-07-27 16:07:44|
|37 |application_1478683272833_2456|SortingDataStreaming                         |2017-07-27 15:49:11|
|38 |application_1478683272833_2454|SortingDataStreaming                         |2017-07-27 15:45:37|
|39 |application_1478683272833_2453|SortingDataStreaming                         |2017-07-27 15:13:17|
|40 |application_1478683272833_2452|SortingDataStreaming                         |2017-07-27 15:10:47|
|41 |application_1478683272833_2451|SortingDataStreaming                         |2017-07-27 14:37:38|
|42 |application_1478683272833_2450|SortingDataStreaming                         |2017-07-27 12:54:15|
|43 |application_1478683272833_2449|SortingDataStreaming                         |2017-07-27 12:46:53|
|44 |application_1478683272833_2448|SortingDataStreaming                         |2017-07-27 12:44:02|
|45 |application_1478683272833_2447|SortingDataStreaming                         |2017-07-27 12:34:38|
|46 |application_1478683272833_2445|SparkSQL::10.76.99.41                        |2017-07-24 16:53:37|
|47 |application_1478683272833_2444|SparkSQL::10.76.99.41                        |2017-07-24 16:38:46|
|48 |application_1478683272833_2443|SparkSQL::10.76.99.41                        |2017-07-24 16:05:37|
|49 |application_1478683272833_2401|SparkSQL::10.76.99.41                        |2017-07-24 15:43:53|
|50 |application_1478683272833_2442|Spark                                        |2017-07-21 01:21:45|
|51 |application_1478683272833_2441|select                                       |2017-07-19 18:46:34|
|52 |application_1478683272833_2440|select                                       |2017-07-19 18:45:56|
|53 |application_1478683272833_2439|select                                       |2017-07-19 18:41:56|
|54 |application_1478683272833_2438|Spark                                        |2017-07-19 11:10:25|
|55 |application_1478683272833_2437|Spark                                        |2017-07-18 19:13:44|
|56 |application_1478683272833_2436|Spark                                        |2017-07-18 19:02:58|
|57 |application_1478683272833_2435|Spark                                        |2017-07-18 19:02:19|
|58 |application_1478683272833_2434|Spark                                        |2017-07-18 18:58:13|
|59 |application_1478683272833_2433|Spark                                        |2017-07-18 14:12:15|
|60 |application_1478683272833_2432|select                                       |2017-07-14 15:24:38|
|61 |application_1478683272833_2431|select                                       |2017-07-14 15:24:22|
|62 |application_1478683272833_2430|select                                       |2017-07-14 15:23:42|
|63 |application_1478683272833_2429|select                                       |2017-07-14 15:23:27|
|64 |application_1478683272833_2428|select                                       |2017-07-14 15:23:01|
|65 |application_1478683272833_2427|select                                       |2017-07-14 15:22:46|
|66 |application_1478683272833_2426|select                                       |2017-07-14 15:22:09|
|67 |application_1478683272833_2425|select                                       |2017-07-14 15:21:54|
|68 |application_1478683272833_2424|select                                       |2017-07-14 15:21:17|
|69 |application_1478683272833_2423|select                                       |2017-07-14 15:21:01|
|70 |application_1478683272833_2422|select                                       |2017-07-14 15:13:22|
|71 |application_1478683272833_2421|select                                       |2017-07-14 15:02:21|
|72 |application_1478683272833_2420|insert                                       |2017-07-14 12:54:38|
|73 |application_1478683272833_2419|insert                                       |2017-07-14 12:54:14|
|74 |application_1478683272833_2418|insert                                       |2017-07-14 12:51:45|
|75 |application_1478683272833_2417|insert                                       |2017-07-14 12:46:05|
|76 |application_1478683272833_2416|insert                                       |2017-07-14 10:22:09|
|77 |application_1478683272833_2415|delete                                       |2017-07-14 10:20:25|
|78 |application_1478683272833_2414|update                                       |2017-07-14 10:18:07|
|79 |application_1478683272833_2413|from                                         |2017-07-14 10:16:02|
|80 |application_1478683272833_2412|insert                                       |2017-07-14 10:13:58|
|81 |application_1478683272833_2411|insert                                       |2017-07-14 10:13:16|
|82 |application_1478683272833_2410|select                                       |2017-07-14 09:18:22|
|83 |application_1478683272833_2409|insert                                       |2017-07-14 09:18:06|
|84 |application_1478683272833_2408|select                                       |2017-07-14 09:17:27|
|85 |application_1478683272833_2407|select                                       |2017-07-14 09:15:46|
|86 |application_1478683272833_2406|select                                       |2017-07-14 09:15:29|
|87 |application_1478683272833_2405|insert                                       |2017-07-14 09:13:35|
|88 |application_1478683272833_2404|insert                                       |2017-07-14 09:12:59|
|89 |application_1478683272833_2403|insert                                       |2017-07-14 09:12:01|
|90 |application_1478683272833_2402|Spark                                        |2017-07-13 12:22:37|
|91 |application_1478683272833_2393|SparkSQL::10.76.99.41                        |2017-07-12 16:25:41|
|92 |application_1478683272833_2400|Spark                                        |2017-07-11 10:09:20|
|93 |application_1478683272833_2399|test_ds1_q1.jar                              |2017-06-23 13:57:25|
|94 |application_1478683272833_2395|Zeppelin                                     |2017-06-22 12:04:34|
|95 |application_1478683272833_2397|DS_testsample_AP_AP_INVOICES_ALL.jar         |2017-06-22 11:00:48|
|96 |application_1478683272833_2396|MYSQL_39_gb_insurance_member.jar             |2017-06-21 11:29:39|
|97 |application_1478683272833_2394|EXT__Browsing_EXT_Browsing.jar               |2017-06-16 10:47:38|
|98 |application_1478683272833_2340|SparkSQL::10.76.99.41                        |2017-06-14 12:25:09|
|99 |application_1478683272833_2392|select                                       |2017-06-13 19:20:50|
|100|application_1478683272833_2391|select                                       |2017-06-13 19:20:15|
|101|application_1478683272833_2390|select                                       |2017-06-13 19:19:28|
|102|application_1478683272833_2389|select                                       |2017-06-13 19:07:18|
|103|application_1478683272833_2388|insert                                       |2017-06-13 19:06:40|
|104|application_1478683272833_2387|VizTestDS_csvfile.jar                        |2017-06-13 16:29:43|
|105|application_1478683272833_2386|DS_HCPharClaim_im_pharmacy_claim.jar         |2017-06-12 16:38:41|
|106|application_1478683272833_2385|gb_im_3_gb_insurance_member.jar              |2017-06-09 16:51:25|
|107|application_1478683272833_2384|gb_im_3_GeneBlock3.jar                       |2017-06-09 16:51:07|
|108|application_1478683272833_2383|gb_im_3_GeneBlock3.jar                       |2017-06-09 16:44:43|
|109|application_1478683272833_2382|gb_im_3_GB_Medical_Claim.jar                 |2017-06-09 16:33:00|
|110|application_1478683272833_2381|gb_IM_2_Geneblock1.jar                       |2017-06-09 16:27:22|
|111|application_1478683272833_2379|gb_IM_2_Geneblock.jar                        |2017-06-09 16:21:28|
|112|application_1478683272833_2380|gb_IM_2_gb_medical_claim.jar                 |2017-06-09 16:21:12|
|113|application_1478683272833_2378|gb_IM_2_gb_medical_claim.jar                 |2017-06-09 16:19:11|
|114|application_1478683272833_2377|insert                                       |2017-06-09 16:15:34|
|115|application_1478683272833_2376|gb_im_1_gb_insurance_member.jar              |2017-06-09 16:13:03|
|116|application_1478683272833_2375|insert                                       |2017-06-09 16:09:09|
|117|application_1478683272833_2374|insert                                       |2017-06-09 15:27:45|
|118|application_1478683272833_2373|select                                       |2017-06-09 14:27:27|
|119|application_1478683272833_2372|gb_im_1_gb_insurance_member.jar              |2017-06-09 14:14:50|
|120|application_1478683272833_2371|sampl12_ds_insurance_member.jar              |2017-06-09 12:44:59|
|121|application_1478683272833_2370|gb_provider_1_gb_insurance_member.jar        |2017-06-09 10:56:15|
|122|application_1478683272833_2369|IM_medclaim_1_im_medical_claim1.jar          |2017-06-09 10:51:00|
|123|application_1478683272833_2368|demo_gemone_1_healthcare_corporate_genome.jar|2017-06-09 10:48:27|
|124|application_1478683272833_2367|MYSQL_39_gb_insurance_member.jar             |2017-06-09 10:46:19|
|125|application_1478683272833_2366|DS_MEDCLAIM_GB_Medical_Claim.jar             |2017-06-09 10:43:38|
|126|application_1478683272833_2365|DS_MEDCLAIM_GB_Medical_Claim.jar             |2017-06-09 10:42:22|
|127|application_1478683272833_2364|DS_MEDCLAIM_GB_Medical_Claim.jar             |2017-06-09 10:40:59|
|128|application_1478683272833_2363|MySQL_IM_1_gb_insurance_member.jar           |2017-06-09 10:38:04|
|129|application_1478683272833_2362|GB1_Insurance_member_gb_insurance_member.jar |2017-06-08 16:07:44|
|130|application_1478683272833_2361|MySQLdemo_1_gb_insurance_member.jar          |2017-06-08 15:55:17|
|131|application_1478683272833_2360|MySQLdemo_1_claims_genome.jar                |2017-06-08 11:56:55|
|132|application_1478683272833_2359|DS_SQLsample_GB_Social.jar                   |2017-06-08 11:30:38|
|133|application_1478683272833_2358|INSERT                                       |2017-06-07 21:50:29|
|134|application_1478683272833_2357|INSERT                                       |2017-06-07 21:50:28|
|135|application_1478683272833_2356|INSERT                                       |2017-06-07 21:50:27|
|136|application_1478683272833_2355|DS1234_salary.jar                            |2017-06-07 21:50:07|
|137|application_1478683272833_2354|DS1234_employee.jar                          |2017-06-07 21:50:06|
|138|application_1478683272833_2353|DS1234_dept_emp.jar                          |2017-06-07 21:50:05|
|139|application_1478683272833_2352|DS1234_department.jar                        |2017-06-07 21:50:04|
|140|application_1478683272833_2351|INSERT                                       |2017-06-07 20:58:13|
|141|application_1478683272833_2349|INSERT                                       |2017-06-07 20:58:12|
|142|application_1478683272833_2350|INSERT                                       |2017-06-07 20:58:12|
|143|application_1478683272833_2347|Lalit_DS_employee.jar                        |2017-06-07 20:57:50|
|144|application_1478683272833_2348|Lalit_DS_dept_emp.jar                        |2017-06-07 20:57:50|
|145|application_1478683272833_2346|Lalit_DS_salary.jar                          |2017-06-07 20:57:49|
|146|application_1478683272833_2345|Lalit_DS_department.jar                      |2017-06-07 20:57:47|
|147|application_1478683272833_2344|Spark                                        |2017-06-07 12:14:04|
|148|application_1478683272833_2343|DS_Social_GB_Social.jar                      |2017-06-06 16:12:11|
|149|application_1478683272833_2342|Spark                                        |2017-06-05 15:52:34|
|150|application_1478683272833_2341|Spark                                        |2017-06-01 16:49:51|
|151|application_1478683272833_1441|SparkSQL::10.76.99.41                        |2017-05-31 11:49:06|
|152|application_1478683272833_2339|select                                       |2017-05-25 18:26:19|
|153|application_1478683272833_2333|DS_HCDentClaim_im_dental_claim.jar           |2017-05-25 16:18:34|
|154|application_1478683272833_2330|DS_HC_Browsing_GB_Browsing.jar               |2017-05-25 16:18:33|
|155|application_1478683272833_2337|DS_HealthCare_Brow_GB_Browsing.jar           |2017-05-25 16:18:33|
|156|application_1478683272833_2338|DS_REF_Corporate_REF_Corporate.jar           |2017-05-25 16:18:33|
|157|application_1478683272833_2328|Spark                                        |2017-05-25 16:18:18|
|158|application_1478683272833_2336|DS_HealthCare_Brow_GB_Browsing.jar           |2017-05-25 15:21:35|
|159|application_1478683272833_2335|DS_HealthCare_Brow_GB_Browsing.jar           |2017-05-25 15:14:01|
|160|application_1478683272833_2334|DS_HealthCare_Brow_GB_Browsing.jar           |2017-05-25 15:08:42|
|161|application_1478683272833_2332|DS_HealthCare_Brow_GB_Browsing.jar           |2017-05-25 12:42:55|
|162|application_1478683272833_2331|DS_Health_Browsing_GB_Browsing.jar           |2017-05-25 12:36:18|
|163|application_1478683272833_2329|select                                       |2017-05-25 11:32:38|
|164|application_1478683272833_2327|mysql_sampl_Ram.jar                          |2017-05-25 10:52:16|
|165|application_1478683272833_2326|select                                       |2017-05-24 19:44:44|
|166|application_1478683272833_2325|select                                       |2017-05-24 18:52:16|
|167|application_1478683272833_2324|select                                       |2017-05-24 18:49:03|
|168|application_1478683272833_2323|select                                       |2017-05-24 18:46:25|
|169|application_1478683272833_2322|select                                       |2017-05-24 18:44:12|
|170|application_1478683272833_2321|select                                       |2017-05-24 18:34:52|
|171|application_1478683272833_2320|select                                       |2017-05-24 18:25:10|
|172|application_1478683272833_2319|select                                       |2017-05-24 18:24:55|
|173|application_1478683272833_2318|select                                       |2017-05-24 18:24:40|
|174|application_1478683272833_2317|select                                       |2017-05-24 18:24:25|
|175|application_1478683272833_2316|select                                       |2017-05-24 18:24:10|
|176|application_1478683272833_2315|select                                       |2017-05-24 18:23:55|
|177|application_1478683272833_2314|select                                       |2017-05-24 18:23:40|
|178|application_1478683272833_2313|select                                       |2017-05-24 18:23:24|
|179|application_1478683272833_2312|select                                       |2017-05-24 18:23:09|
|180|application_1478683272833_2311|select                                       |2017-05-24 18:22:53|
|181|application_1478683272833_2310|select                                       |2017-05-24 18:22:38|
|182|application_1478683272833_2309|select                                       |2017-05-24 18:22:22|
|183|application_1478683272833_2308|select                                       |2017-05-24 18:22:06|
|184|application_1478683272833_2307|select                                       |2017-05-24 18:21:50|
|185|application_1478683272833_2306|select                                       |2017-05-24 18:21:35|
|186|application_1478683272833_2305|select                                       |2017-05-24 18:21:18|
|187|application_1478683272833_2304|select                                       |2017-05-24 18:21:04|
|188|application_1478683272833_2303|select                                       |2017-05-24 18:20:48|
|189|application_1478683272833_2302|select                                       |2017-05-24 18:20:33|
|190|application_1478683272833_2301|select                                       |2017-05-24 18:20:18|
|191|application_1478683272833_2300|select                                       |2017-05-24 18:12:52|
|192|application_1478683272833_2299|select                                       |2017-05-24 18:12:36|
|193|application_1478683272833_2298|select                                       |2017-05-24 18:12:20|
|194|application_1478683272833_2297|select                                       |2017-05-24 18:12:05|
|195|application_1478683272833_2296|select                                       |2017-05-24 18:11:50|
|196|application_1478683272833_2295|select                                       |2017-05-24 18:11:34|
|197|application_1478683272833_2294|select                                       |2017-05-24 18:11:19|
|198|application_1478683272833_2293|select                                       |2017-05-24 18:11:04|
|199|application_1478683272833_2292|select                                       |2017-05-24 18:10:48|
|200|application_1478683272833_2291|select                                       |2017-05-24 18:10:34|
|201|application_1478683272833_2290|select                                       |2017-05-24 18:10:18|
|202|application_1478683272833_2289|select                                       |2017-05-24 18:10:03|
|203|application_1478683272833_2288|select                                       |2017-05-24 18:09:47|
|204|application_1478683272833_2287|select                                       |2017-05-24 18:09:32|
|205|application_1478683272833_2286|select                                       |2017-05-24 18:09:16|
|206|application_1478683272833_2285|select                                       |2017-05-24 18:09:01|
|207|application_1478683272833_2284|select                                       |2017-05-24 18:08:46|
|208|application_1478683272833_2283|select                                       |2017-05-24 18:08:30|
|209|application_1478683272833_2282|select                                       |2017-05-24 18:08:15|
|210|application_1478683272833_2281|select                                       |2017-05-24 18:07:59|
|211|application_1478683272833_2280|select                                       |2017-05-24 16:20:15|
|212|application_1478683272833_2279|select                                       |2017-05-24 16:20:01|
|213|application_1478683272833_2278|select                                       |2017-05-24 16:19:44|
|214|application_1478683272833_2277|select                                       |2017-05-24 16:19:29|
|215|application_1478683272833_2276|select                                       |2017-05-24 16:19:15|
|216|application_1478683272833_2275|select                                       |2017-05-24 16:18:59|
|217|application_1478683272833_2274|select                                       |2017-05-24 16:18:45|
|218|application_1478683272833_2273|select                                       |2017-05-24 16:18:30|
|219|application_1478683272833_2272|select                                       |2017-05-24 16:18:14|
|220|application_1478683272833_2271|select                                       |2017-05-24 16:17:59|
|221|application_1478683272833_2270|select                                       |2017-05-24 16:17:44|
|222|application_1478683272833_2269|select                                       |2017-05-24 16:17:28|
|223|application_1478683272833_2268|select                                       |2017-05-24 16:17:13|
|224|application_1478683272833_2267|select                                       |2017-05-24 16:16:57|
|225|application_1478683272833_2266|select                                       |2017-05-24 16:16:41|
|226|application_1478683272833_2265|select                                       |2017-05-24 16:16:27|
|227|application_1478683272833_2264|select                                       |2017-05-24 16:16:13|
|228|application_1478683272833_2263|select                                       |2017-05-24 16:15:58|
|229|application_1478683272833_2262|select                                       |2017-05-24 16:15:43|
|230|application_1478683272833_2261|select                                       |2017-05-24 16:15:27|
|231|application_1478683272833_2260|select                                       |2017-05-24 16:12:31|
|232|application_1478683272833_2259|select                                       |2017-05-24 16:12:14|
|233|application_1478683272833_2258|select                                       |2017-05-24 16:11:59|
|234|application_1478683272833_2257|select                                       |2017-05-24 16:11:43|
|235|application_1478683272833_2256|select                                       |2017-05-24 16:11:29|
|236|application_1478683272833_2255|select                                       |2017-05-24 16:11:14|
|237|application_1478683272833_2254|select                                       |2017-05-24 16:10:58|
|238|application_1478683272833_2253|select                                       |2017-05-24 16:10:43|
|239|application_1478683272833_2252|select                                       |2017-05-24 16:10:27|
|240|application_1478683272833_2251|select                                       |2017-05-24 16:10:12|
|241|application_1478683272833_2250|select                                       |2017-05-24 16:09:57|
|242|application_1478683272833_2249|select                                       |2017-05-24 16:09:40|
|243|application_1478683272833_2248|select                                       |2017-05-24 16:09:26|
|244|application_1478683272833_2247|select                                       |2017-05-24 16:09:10|
|245|application_1478683272833_2246|select                                       |2017-05-24 16:08:53|
|246|application_1478683272833_2245|select                                       |2017-05-24 16:08:38|
|247|application_1478683272833_2244|select                                       |2017-05-24 16:08:22|
|248|application_1478683272833_2243|select                                       |2017-05-24 16:08:07|
|249|application_1478683272833_2242|select                                       |2017-05-24 16:07:51|
|250|application_1478683272833_2241|select                                       |2017-05-24 16:07:37|
|251|application_1478683272833_2240|select                                       |2017-05-24 16:01:15|
|252|application_1478683272833_2239|select                                       |2017-05-24 16:00:59|
|253|application_1478683272833_2238|select                                       |2017-05-24 14:56:06|
|254|application_1478683272833_2237|select                                       |2017-05-24 14:53:14|
|255|application_1478683272833_2236|select                                       |2017-05-24 14:34:42|
|256|application_1478683272833_2235|select                                       |2017-05-24 14:33:56|
|257|application_1478683272833_2234|select                                       |2017-05-24 14:25:08|
|258|application_1478683272833_2231|Spark                                        |2017-05-24 13:52:25|
|259|application_1478683272833_2233|select                                       |2017-05-24 12:28:38|
|260|application_1478683272833_2232|select                                       |2017-05-24 12:18:10|
|261|application_1478683272833_2227|Spark                                        |2017-05-23 21:33:50|
|262|application_1478683272833_2223|Spark                                        |2017-05-23 21:33:39|
|263|application_1478683272833_2230|Spark                                        |2017-05-23 21:33:39|
|264|application_1478683272833_2224|Spark                                        |2017-05-23 21:33:37|
|265|application_1478683272833_2229|Spark                                        |2017-05-23 21:33:36|
|266|application_1478683272833_2225|Spark                                        |2017-05-23 21:33:36|
|267|application_1478683272833_2228|MySQL_essar_Ram.jar                          |2017-05-23 21:30:40|
|268|application_1478683272833_2226|sql_sample_salary.jar                        |2017-05-23 21:30:23|
|269|application_1478683272833_2220|Spark                                        |2017-05-23 21:30:09|
+---+------------------------------+---------------------------------------------+-------------------+
scDebugger>setapplicationid application_1493795227502_5174
Application Id set to :application_1493795227502_5174
scDebugger>hosts
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+-----------+----------------------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
|Executor ID|Host                        |Executor Info.Log Urls                                                                                                                                                                                                                                                   |
+-----------+----------------------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
|driver     |10.118.214.140              |null                                                                                                                                                                                                                                                                     |
|1          |bbsr02cloud05.ad.infosys.com|[http://bbsr02cloud05.ad.infosys.com:8042/node/containerlogs/container_1493795227502_5174_01_000002/kathijabanu.m/stderr?start=-4096,http://bbsr02cloud05.ad.infosys.com:8042/node/containerlogs/container_1493795227502_5174_01_000002/kathijabanu.m/stdout?start=-4096]|
|2          |bbsr02cloud04.ad.infosys.com|[http://bbsr02cloud04.ad.infosys.com:8042/node/containerlogs/container_1493795227502_5174_01_000003/kathijabanu.m/stderr?start=-4096,http://bbsr02cloud04.ad.infosys.com:8042/node/containerlogs/container_1493795227502_5174_01_000003/kathijabanu.m/stdout?start=-4096]|
+-----------+----------------------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
scDebugger>search Job Result
Search Result for Job Result
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
{"Event":"SparkListenerJobEnd","Job ID":0,"Completion Time":1505289545647,"Job Result":{"Result":"JobSucceeded"}}
{"Event":"SparkListenerJobEnd","Job ID":1,"Completion Time":1505289545763,"Job Result":{"Result":"JobSucceeded"}}
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
scDebugger>disk-memory-usage
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+-----------+------------------+---------------+----------------+
|Executor ID|Maximum Memory(MB)|Memory Used(MB)|Disk Spilled(MB)|
+-----------+------------------+---------------+----------------+
|1          |2120.0            |1968.0         |2670.0          |
|2          |2120.0            |2097.0         |2387.0          |
+-----------+------------------+---------------+----------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
scDebugger>executors-hosts-partitions
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+---+-----------+----------------------------+---------+--------------+
|SNo|Executor Id|Host                        |Stage Id |Partition Id  |
+---+-----------+----------------------------+---------+--------------+
|1  |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :17|
|2  |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :18|
|3  |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :19|
|4  |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :20|
|5  |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :21|
|6  |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :22|
|7  |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :23|
|8  |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :24|
|9  |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :25|
|10 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :26|
|11 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :27|
|12 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :28|
|13 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :29|
|14 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :30|
|15 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :31|
|16 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :32|
|17 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :33|
|18 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :34|
|19 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :35|
|20 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :36|
|21 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :37|
|22 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :38|
|23 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :39|
|24 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :40|
|25 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :41|
|26 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :42|
|27 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :43|
|28 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :44|
|29 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :45|
|30 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :46|
|31 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :47|
|32 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :48|
|33 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :49|
|34 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :50|
|35 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :51|
|36 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :52|
|37 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :53|
|38 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :54|
|39 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :55|
|40 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :56|
|41 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :57|
|42 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :58|
|43 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :59|
|44 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :60|
|45 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :61|
|46 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :62|
|47 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :63|
|48 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :64|
|49 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :65|
|50 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :66|
|51 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :67|
|52 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :68|
|53 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :69|
|54 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :70|
|55 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :71|
|56 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :72|
|57 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :73|
|58 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :74|
|59 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :75|
|60 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :76|
|61 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :77|
|62 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :0 |
|63 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :1 |
|64 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :2 |
|65 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :3 |
|66 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :4 |
|67 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :5 |
|68 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :6 |
|69 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :7 |
|70 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :8 |
|71 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :9 |
|72 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :10|
|73 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :11|
|74 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :12|
|75 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :13|
|76 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :14|
|77 |Executor(2)|bbsr02cloud04.ad.infosys.com|Stages :0|Partition: :15|
|78 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :0|Partition: :16|
|79 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :1|Partition: :78|
|80 |Executor(1)|bbsr02cloud05.ad.infosys.com|Stages :2|Partition: :79|
+---+-----------+----------------------------+---------+--------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
scDebugger>memoryUsed
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+---+------------------------------+---------------------+-----------------------+-----------------+------------------------+
|SNo|App Id                        |Resources            |Used Resources         |num of Containers|Cluster                 |
+---+------------------------------+---------------------+-----------------------+-----------------+------------------------+
|1  |application_1478683272833_2220|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|2  |application_1478683272833_2220|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|3  |application_1478683272833_2231|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160|
|4  |application_1478683272833_2231|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|5  |application_1478683272833_2231|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|6  |application_1478683272833_2231|memory:45056,vCores:1|memory:677888,vCores:17|numContainers=17 |memory:768000,vCores:160|
|7  |application_1478683272833_2231|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160|
|8  |application_1478683272833_2328|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160|
|9  |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|10 |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|11 |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|12 |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|13 |application_1478683272833_2328|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160|
|14 |application_1478683272833_2328|memory:45056,vCores:1|memory:632832,vCores:16|numContainers=16 |memory:768000,vCores:160|
|15 |application_1478683272833_2328|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|16 |application_1478683272833_2341|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160|
|17 |application_1478683272833_2341|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|18 |application_1478683272833_2341|memory:45056,vCores:1|memory:677888,vCores:17|numContainers=17 |memory:768000,vCores:160|
|19 |application_1478683272833_2341|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160|
|20 |application_1478683272833_2342|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|21 |application_1478683272833_2342|memory:45056,vCores:1|memory:677888,vCores:17|numContainers=17 |memory:768000,vCores:160|
|22 |application_1478683272833_2342|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160|
|23 |application_1478683272833_2344|memory:45056,vCores:1|memory:587776,vCores:15|numContainers=15 |memory:768000,vCores:160|
|24 |application_1478683272833_2344|memory:45056,vCores:1|memory:768000,vCores:19|numContainers=19 |memory:768000,vCores:160|
|25 |application_1478683272833_2344|memory:45056,vCores:1|memory:722944,vCores:18|numContainers=18 |memory:768000,vCores:160|
|26 |application_1478683272833_2400|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|27 |application_1478683272833_2400|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|28 |application_1478683272833_2400|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|29 |application_1478683272833_2402|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|30 |application_1478683272833_2402|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|31 |application_1478683272833_2402|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|32 |application_1478683272833_2433|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|33 |application_1478683272833_2433|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|34 |application_1478683272833_2433|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|35 |application_1478683272833_2433|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|36 |application_1478683272833_2434|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|37 |application_1478683272833_2434|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|38 |application_1478683272833_2434|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|39 |application_1478683272833_2436|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|40 |application_1478683272833_2436|memory:45056,vCores:1|memory:733184,vCores:28|numContainers=28 |memory:768000,vCores:160|
|41 |application_1478683272833_2436|memory:45056,vCores:1|memory:598016,vCores:25|numContainers=25 |memory:768000,vCores:160|
|42 |application_1478683272833_2436|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|43 |application_1478683272833_2437|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|44 |application_1478683272833_2437|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|45 |application_1478683272833_2438|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|46 |application_1478683272833_2438|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|47 |application_1478683272833_2442|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|48 |application_1478683272833_2442|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|49 |application_1478683272833_2442|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|50 |application_1478683272833_2446|memory:45056,vCores:1|memory:595968,vCores:23|numContainers=23 |memory:768000,vCores:160|
|51 |application_1478683272833_2446|memory:45056,vCores:1|memory:641024,vCores:24|numContainers=24 |memory:768000,vCores:160|
|52 |application_1478683272833_2447|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|53 |application_1478683272833_2447|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|54 |application_1478683272833_2448|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|55 |application_1478683272833_2448|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|56 |application_1478683272833_2449|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|57 |application_1478683272833_2449|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|58 |application_1478683272833_2449|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|59 |application_1478683272833_2449|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|60 |application_1478683272833_2450|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|61 |application_1478683272833_2450|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|62 |application_1478683272833_2451|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|63 |application_1478683272833_2451|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|64 |application_1478683272833_2451|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|65 |application_1478683272833_2452|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|66 |application_1478683272833_2452|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|67 |application_1478683272833_2453|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|68 |application_1478683272833_2453|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|69 |application_1478683272833_2453|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|70 |application_1478683272833_2453|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|71 |application_1478683272833_2454|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|72 |application_1478683272833_2454|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|73 |application_1478683272833_2456|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|74 |application_1478683272833_2456|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|75 |application_1478683272833_2456|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|76 |application_1478683272833_2457|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|77 |application_1478683272833_2457|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|78 |application_1478683272833_2457|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|79 |application_1478683272833_2458|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|80 |application_1478683272833_2458|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|81 |application_1478683272833_2459|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|82 |application_1478683272833_2459|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|83 |application_1478683272833_2460|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|84 |application_1478683272833_2460|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|85 |application_1478683272833_2460|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|86 |application_1478683272833_2460|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|87 |application_1478683272833_2461|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|88 |application_1478683272833_2461|memory:45056,vCores:1|memory:551936,vCores:23|numContainers=23 |memory:768000,vCores:160|
|89 |application_1478683272833_2461|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|90 |application_1478683272833_2461|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|91 |application_1478683272833_2461|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|92 |application_1478683272833_2462|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|93 |application_1478683272833_2462|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|94 |application_1478683272833_2462|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|95 |application_1478683272833_2463|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|96 |application_1478683272833_2463|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|97 |application_1478683272833_2464|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|98 |application_1478683272833_2464|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|99 |application_1478683272833_2464|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|100|application_1478683272833_2465|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|101|application_1478683272833_2465|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|102|application_1478683272833_2466|memory:45056,vCores:1|memory:461824,vCores:21|numContainers=21 |memory:768000,vCores:160|
|103|application_1478683272833_2469|memory:45056,vCores:1|memory:461824,vCores:21|numContainers=21 |memory:768000,vCores:160|
|104|application_1478683272833_2470|memory:45056,vCores:1|memory:461824,vCores:21|numContainers=21 |memory:768000,vCores:160|
|105|application_1478683272833_2473|memory:45056,vCores:1|memory:461824,vCores:21|numContainers=21 |memory:768000,vCores:160|
|106|application_1478683272833_2478|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|107|application_1478683272833_2478|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|108|application_1478683272833_2478|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|109|application_1478683272833_2479|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|110|application_1478683272833_2479|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|111|application_1478683272833_2479|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|112|application_1478683272833_2480|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|113|application_1478683272833_2480|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|114|application_1478683272833_2480|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|115|application_1478683272833_2481|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|116|application_1478683272833_2481|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|117|application_1478683272833_2481|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|118|application_1478683272833_2482|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
|119|application_1478683272833_2482|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|120|application_1478683272833_2482|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|121|application_1478683272833_2482|memory:45056,vCores:1|memory:642048,vCores:25|numContainers=25 |memory:768000,vCores:160|
|122|application_1478683272833_2489|memory:45056,vCores:1|memory:732160,vCores:27|numContainers=27 |memory:768000,vCores:160|
|123|application_1478683272833_2489|memory:45056,vCores:1|memory:596992,vCores:24|numContainers=24 |memory:768000,vCores:160|
|124|application_1478683272833_2489|memory:45056,vCores:1|memory:687104,vCores:26|numContainers=26 |memory:768000,vCores:160|
+---+------------------------------+---------------------+-----------------------+-----------------+------------------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
scDebugger>jobMetrics
============== Job Metrics ==============
Usage:
1. Application
2. Job
3. Stage
4. Task
5. Exit
=========================================
Enter an option listed above to view specified metrics : 1
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+------------+------------------------------+-------------+-------------------+-------------------+-------------+
|App Name    |App ID                        |User         |Submission Time    |Completion Time    |Duration(min)|
+------------+------------------------------+-------------+-------------------+-------------------+-------------+
|sparkProject|application_1493795227502_5174|kathijabanu.m|2017-09-13 13:24:36|2017-09-13 13:29:05|4.49         |
+------------+------------------------------+-------------+-------------------+-------------------+-------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
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
=========================================
Enter an option listed above to view specified metrics : 2
Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Job IDs : 0,1
Enter an option or type "q" to quit Job metrics :0
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+------+-------------------+-------------------+-------------+---------+------------+
|Job ID|Submission Time    |Completion Time    |Duration(min)|Stage IDs|Job Status  |
+------+-------------------+-------------------+-------------+---------+------------+
|0     |2017-09-13 13:24:42|2017-09-13 13:29:05|4.38         |[0, 1]   |JobSucceeded|
+------+-------------------+-------------------+-------------+---------+------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Job IDs : 0,1
Enter an option or type "q" to quit Job metrics :ALL
+------+-------------------+-------------------+-------------+---------+------------+
|Job ID|Submission Time    |Completion Time    |Duration(min)|Stage IDs|Job Status  |
+------+-------------------+-------------------+-------------+---------+------------+
|0     |2017-09-13 13:24:42|2017-09-13 13:29:05|4.38         |[0, 1]   |JobSucceeded|
|1     |2017-09-13 13:29:05|2017-09-13 13:29:05|0.0          |[2]      |JobSucceeded|
+------+-------------------+-------------------+-------------+---------+------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Enter any Job ID listed below to view specific Job metrics or enter "ALL" to view all the jobs :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Stage IDs : 0,1,2
Enter an option or type "q" to quit stage metrics :2
====================================== Metrics for Stage ID: 2 =====================================
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

======================================================================================================
Enter any stage ID listed below to view specific stage metrics or enter "ALL" to view all the stages :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Stage IDs : 0,1,2
Enter an option or type "q" to quit stage metrics :ALL
======================================== Metrics for all Stages ======================================
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

=====================================================================================================
Enter any stage ID listed below to view specific stage metrics or enter "ALL" to view all the stages :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Stage IDs : 0,1,2
Enter an option or type "q" to quit stage metrics :q
=================== Ending Stage Metrics ===================
============== Job Metrics ==============
Usage:
1. Application
2. Job
3. Stage
4. Task
5. Exit
=========================================
Enter an option listed above to view specified metrics : 4
Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+-------+-------------+
|Task ID|Locality     |
+-------+-------------+
|0      |NODE_LOCAL   |
|1      |NODE_LOCAL   |
|2      |NODE_LOCAL   |
|3      |NODE_LOCAL   |
|4      |NODE_LOCAL   |
|5      |NODE_LOCAL   |
|6      |NODE_LOCAL   |
|7      |NODE_LOCAL   |
|8      |NODE_LOCAL   |
|9      |NODE_LOCAL   |
|10     |NODE_LOCAL   |
|11     |NODE_LOCAL   |
|12     |NODE_LOCAL   |
|13     |NODE_LOCAL   |
|14     |NODE_LOCAL   |
|15     |NODE_LOCAL   |
|16     |NODE_LOCAL   |
|17     |NODE_LOCAL   |
|18     |NODE_LOCAL   |
|19     |NODE_LOCAL   |
|20     |NODE_LOCAL   |
|21     |NODE_LOCAL   |
|22     |NODE_LOCAL   |
|23     |NODE_LOCAL   |
|24     |NODE_LOCAL   |
|25     |NODE_LOCAL   |
|26     |NODE_LOCAL   |
|27     |NODE_LOCAL   |
|28     |NODE_LOCAL   |
|29     |NODE_LOCAL   |
|30     |NODE_LOCAL   |
|31     |NODE_LOCAL   |
|32     |NODE_LOCAL   |
|33     |NODE_LOCAL   |
|34     |NODE_LOCAL   |
|35     |NODE_LOCAL   |
|36     |NODE_LOCAL   |
|37     |NODE_LOCAL   |
|38     |NODE_LOCAL   |
|39     |NODE_LOCAL   |
|40     |NODE_LOCAL   |
|41     |NODE_LOCAL   |
|42     |NODE_LOCAL   |
|43     |NODE_LOCAL   |
|44     |NODE_LOCAL   |
|45     |NODE_LOCAL   |
|46     |NODE_LOCAL   |
|47     |NODE_LOCAL   |
|48     |NODE_LOCAL   |
|49     |NODE_LOCAL   |
|50     |NODE_LOCAL   |
|51     |NODE_LOCAL   |
|52     |NODE_LOCAL   |
|53     |NODE_LOCAL   |
|54     |NODE_LOCAL   |
|55     |NODE_LOCAL   |
|56     |NODE_LOCAL   |
|57     |NODE_LOCAL   |
|58     |NODE_LOCAL   |
|59     |NODE_LOCAL   |
|60     |NODE_LOCAL   |
|61     |NODE_LOCAL   |
|62     |NODE_LOCAL   |
|63     |NODE_LOCAL   |
|64     |NODE_LOCAL   |
|65     |RACK_LOCAL   |
|66     |RACK_LOCAL   |
|67     |NODE_LOCAL   |
|68     |NODE_LOCAL   |
|69     |RACK_LOCAL   |
|70     |RACK_LOCAL   |
|71     |NODE_LOCAL   |
|72     |NODE_LOCAL   |
|73     |RACK_LOCAL   |
|74     |NODE_LOCAL   |
|75     |NODE_LOCAL   |
|76     |RACK_LOCAL   |
|77     |RACK_LOCAL   |
|78     |PROCESS_LOCAL|
|79     |PROCESS_LOCAL|
+-------+-------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
+-------+------------+
|Task ID|Records Read|
+-------+------------+
|0      |1141365     |
|1      |1148933     |
|2      |1128441     |
|3      |1126880     |
|4      |1138937     |
|5      |1135880     |
|6      |1151384     |
|7      |1134983     |
|8      |1152070     |
|9      |1155912     |
|10     |1167340     |
|11     |1133274     |
|12     |1141365     |
|13     |1128441     |
|14     |1138937     |
|15     |1126880     |
|16     |1148933     |
|17     |1135880     |
|18     |1152070     |
|19     |1167340     |
|20     |1151384     |
|21     |1134983     |
|22     |1133274     |
|23     |1148933     |
|24     |1155912     |
|25     |1141365     |
|26     |1126880     |
|27     |1135880     |
|28     |1128441     |
|29     |1138937     |
|30     |1151384     |
|31     |1134983     |
|32     |1152070     |
|33     |1155912     |
|34     |1134983     |
|35     |1152070     |
|36     |1167340     |
|37     |1133274     |
|38     |1155912     |
|39     |1141365     |
|40     |1141365     |
|41     |1128441     |
|42     |1148933     |
|43     |1126880     |
|44     |1138937     |
|45     |1148933     |
|46     |1135880     |
|47     |1151384     |
|48     |1126880     |
|49     |1135880     |
|50     |1155912     |
|51     |1167340     |
|52     |1151384     |
|53     |1167340     |
|54     |1133274     |
|55     |1128441     |
|56     |1133274     |
|57     |1128441     |
|58     |1148933     |
|59     |1138937     |
|60     |1134983     |
|61     |1126880     |
|62     |1133274     |
|63     |1152070     |
|64     |1141365     |
|65     |1257796     |
|66     |1257796     |
|67     |1138937     |
|68     |1135880     |
|69     |1257796     |
|70     |1257796     |
|71     |1151384     |
|72     |1134983     |
|73     |1257796     |
|74     |1152070     |
|75     |1155912     |
|76     |1167340     |
|77     |1257796     |
|78     |null        |
|79     |1           |
+-------+------------+

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Select a task metric listed below to view specific metrics or enter "ALL" to view all the task metrics :
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
=================== Ending Task Metrics ===================
============== Job Metrics ==============
Usage:
1. Application
2. Job
3. Stage
4. Task
5. Exit
=========================================
Enter an option listed above to view specified metrics : 5
=================== Ending Job Metrics ===================
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
scDebugger>exit
=================== Ending session ===================


