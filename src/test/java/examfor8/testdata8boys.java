package examfor8;

import org.testng.annotations.DataProvider;

public class testdata8boys {

    @DataProvider(name = "testData8Boys")
    public Object[][] testData8Boys(){

        return new Object[][] {
                {"1",	"AMIT KUMAR",		"SHAKAL SAHNI",       },
                {"2",	"ANSHU RAJ",		"RAJESH KUMAR",       },
                {"3",	"DHARMVEER KUMAR",		"UPENDRA SAHNI",  },
                {"4",	"KARAN KUMAR",		"DHARMENDRA SAHNI",   },
                {"5",	"MD MANJUR",		"MOHAMMAD SERAJUL",   },
                {"6",	"MITHELISH KUMAR",		"KISHUNDEV SAHNI",},
                {"7",	"MOHAMMAD IMRAN",		"JAIGAM ALAM",    },
                {"8",	"RAJA BABU",		"SHANKAR PANDIT",     },
                {"9",	"RAJU KUMAR",		"SHANKAR PANDIT",     },
                {"10",	"SACHINE KUMAR",		"DHIRAJ KUMAR",   },
                {"11",	"SAURAV KUMAR",		"RANJIT RAY",         },
                {"12",	"SHRIKANT KUMAR",		"MANOJ KUMAR",    },
                {"13",	"SUNNY KUMAR",		"RAMESH RAY",         },


        };

    }


}
