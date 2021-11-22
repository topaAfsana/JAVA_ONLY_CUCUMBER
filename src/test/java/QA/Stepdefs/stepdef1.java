package QA.Stepdefs;

//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

//import cucumber.api.java.en.Given;

//import cucumber.api.java.en.Given;

public class stepdef1 {


    @Given("User naviaget to Facebook")
    public void user_naviaget_to_facebook() {
       System.out.println("TOPA RESOLVED");
    }



    @Given("User enter data Inquiry information in form as below")
    public void user_enter_data_inquiry_information_in_form_as_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.


        // CUCUMBER TABLE
        //|UscisOffice|Receipt|Visa|G28match|ReasonForinquiry|
        //    |      WRO   |    ABC123456789   | 1B2   |   YES     |        Business Activity        |


        // WAY1
     List<Map<String,String>> rows= dataTable.asMaps(String.class,String.class);
     System.out.println(rows);
        // [{UscisOffice=WRO, Receipt=ABC123456789, Visa=1B2, G28match=YES, ReasonForinquiry=Business Activity}]Activity
     for (Map<String,String> columns : rows){
         System.out.println(columns.get("UscisOffice"));
         System.out.println(columns.get("Receipt"));
     }
    }



    @Given("User enter 2nd data Inquiry information in form as below")
    public void user_enter_2nd_data_inquiry_information_in_form_as_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.

        // CUCUMBER TABLE
        // |DUNS|PHONE|COMPANY|STREET|CITY|ZIP|STATE|COUNTRY|
        //      |      N/A   |    N/A   | TEST_AFSANA_ORG1   |   200 ST     |         ARLINGTON        |222|Virginia- VA|UNITED STATES|


        // WAY2
        List<String> title=dataTable.row(0);
        List<String> data=dataTable.row(1);

        System.out.println(title);
        // [DUNS, PHONE, COMPANY, STREET, CITY, ZIP, STATE, COUNTRY]

        System.out.println(data);
        // [N/A, N/A, TEST_AFSANA_ORG1, 200 ST, ARLINGTON, 222, Virginia- VA, UNITED STATES]



        String DUNS=data.get(0);
        String PHONE=data.get(1);
        String COMPANY=data.get(2);
        String CITY=data.get(3);

        System.out.println(DUNS);
        System.out.println(PHONE);
        System.out.println(COMPANY);
        System.out.println(CITY);


        //    N/A
        //    N/A
        //    TEST_AFSANA_ORG1
        //    200 ST


    }





    @Given("User enter 3nd data Inquiry information in form as below")
    public void user_enter_3nd_data_inquiry_information_in_form_as_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        // CUCUMBER TABLE
//    |searchType              |   searchData      |
//    | Receipt Number         |   SRC119008890    |
//    |   Inquiry DUN          |    964392237      |
//    |    COompany Name       |    Afsana Org     |
//    |  Added By              |    aktopa         |
//    |   Resolution           | Resolved by Scops |

        List<String> datas=dataTable.asList();
        List<String> dataTitle=dataTable.row(0);
        List<String> data=dataTable.row(1);
        System.out.println(datas);
//        [searchType, searchData, Receipt Number, SRC119008890, Inquiry DUN, 964392237, COompany Name, Afsana Org, Added By, aktopa, Resolution, Resolved by Scops]

        System.out.println(dataTitle);
//        [searchType, searchData]

        System.out.println(data);
//        [Receipt Number, SRC119008890]

//WAY 3
        List<Map<String,String>> dataMap=dataTable.asMaps(String.class,String.class);
        int count=0;
for(Map<String,String> column : dataMap){
    System.out.println(count++);
    System.out.println(column.get("searchType"));
    System.out.println(column.get("searchData"));
}


    }




    @Given("User enter 4th data Inquiry information in form as below")
    public void user_enter_4th_data_inquiry_information_in_form_as_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

//        |Names   |
//      | Topa   |
//      | Toma   |
//      | Jafrin |
//      | Tanjim |

//WAY 4
        List<String> datas= dataTable.asList();

        System.out.println(datas);
//        [Names, Topa, Toma, Jafrin, Tanjim]

        for (int i=1;i<datas.size();i++){
            System.out.println(datas.get(i));
        }

//        Names
//        Topa
//        Toma
//        Jafrin
//        Tanjim



//        for (String data : datas){
//            System.out.println(data);
//        }
    }



}

