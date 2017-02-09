package com.example.brsoft.retrofitdemo;

import java.util.List;

/**
 * Created by brsoft on 7/1/17.
 */

public class DemoGetResponseModel {
    /**
     * code : 0
     * error : false
     * message : country
     * data : [{"countryid":"1","country":"Afghanistan"},{"countryid":"2","country":"Albania"},{"countryid":"3","country":"Algeria"},{"countryid":"4","country":"American Samoa"},{"countryid":"5","country":"Andorra"},{"countryid":"6","country":"Angola"},{"countryid":"7","country":"Anguilla"},{"countryid":"8","country":"Antarctica"},{"countryid":"9","country":"Antigua and Barbuda"},{"countryid":"10","country":"Argentina"},{"countryid":"11","country":"Armenia"},{"countryid":"12","country":"Aruba"},{"countryid":"13","country":"Ashmore and Cartier"},{"countryid":"14","country":"Australia"},{"countryid":"15","country":"Austria"},{"countryid":"16","country":"Azerbaijan"},{"countryid":"17","country":"The Bahamas"},{"countryid":"18","country":"Bahrain"},{"countryid":"19","country":"Baker Island"},{"countryid":"20","country":"Bangladesh"},{"countryid":"21","country":"Barbados"},{"countryid":"22","country":"Bassas da India"},{"countryid":"23","country":"Belarus"},{"countryid":"24","country":"Belgium"},{"countryid":"25","country":"Belize"},{"countryid":"26","country":"Benin"},{"countryid":"27","country":"Bermuda"},{"countryid":"28","country":"Bhutan"},{"countryid":"29","country":"Bolivia"},{"countryid":"30","country":"Bosnia and Herzegovina"},{"countryid":"31","country":"Botswana"},{"countryid":"32","country":"Bouvet Island"},{"countryid":"33","country":"Brazil"},{"countryid":"34","country":"British Indian Ocean Territory"},{"countryid":"35","country":"British Virgin Islands"},{"countryid":"36","country":"Brunei Darussalam"},{"countryid":"37","country":"Bulgaria"},{"countryid":"38","country":"Burkina Faso"},{"countryid":"39","country":"Burma"},{"countryid":"40","country":"Burundi"},{"countryid":"41","country":"Cambodia"},{"countryid":"42","country":"Cameroon"},{"countryid":"43","country":"Canada"},{"countryid":"44","country":"Cape Verde"},{"countryid":"45","country":"Cayman Islands"},{"countryid":"46","country":"Central African Republic"},{"countryid":"47","country":"Chad"},{"countryid":"48","country":"Chile"},{"countryid":"49","country":"China"},{"countryid":"50","country":"Christmas Island"},{"countryid":"51","country":"Clipperton Island"},{"countryid":"52","country":"Cocos (Keeling) Islands"},{"countryid":"53","country":"Colombia"},{"countryid":"54","country":"Comoros"},{"countryid":"55","country":"Congo, Democratic Republic of the"},{"countryid":"56","country":"Congo, Republic of the"},{"countryid":"57","country":"Cook Islands"},{"countryid":"58","country":"Coral Sea Islands"},{"countryid":"59","country":"Costa Rica"},{"countryid":"60","country":"Cote d'Ivoire"},{"countryid":"61","country":"Croatia"},{"countryid":"62","country":"Cuba"},{"countryid":"63","country":"Cyprus"},{"countryid":"64","country":"Czech Republic"},{"countryid":"65","country":"Denmark"},{"countryid":"66","country":"Djibouti"},{"countryid":"67","country":"Dominica"},{"countryid":"68","country":"Dominican Republic"},{"countryid":"69","country":"East Timor"},{"countryid":"70","country":"Ecuador"},{"countryid":"71","country":"Egypt"},{"countryid":"72","country":"El Salvador"},{"countryid":"73","country":"Equatorial Guinea"},{"countryid":"74","country":"Eritrea"},{"countryid":"75","country":"Estonia"},{"countryid":"76","country":"Ethiopia"},{"countryid":"77","country":"Europa Island"},{"countryid":"78","country":"Falkland Islands (Islas Malvinas)"},{"countryid":"79","country":"Faroe Islands"},{"countryid":"80","country":"Fiji"},{"countryid":"81","country":"Finland"},{"countryid":"82","country":"France"},{"countryid":"83","country":"France, Metropolitan"},{"countryid":"84","country":"French Guiana"},{"countryid":"85","country":"French Polynesia"},{"countryid":"86","country":"French Southern and Antarctic Lands"},{"countryid":"87","country":"Gabon"},{"countryid":"88","country":"The Gambia"},{"countryid":"89","country":"Gaza Strip"},{"countryid":"90","country":"Georgia"},{"countryid":"91","country":"Germany"},{"countryid":"92","country":"Ghana"},{"countryid":"93","country":"Gibraltar"},{"countryid":"94","country":"Glorioso Islands"},{"countryid":"95","country":"Greece"},{"countryid":"96","country":"Greenland"},{"countryid":"97","country":"Grenada"},{"countryid":"98","country":"Guadeloupe"},{"countryid":"99","country":"Guam"},{"countryid":"100","country":"Guatemala"},{"countryid":"101","country":"Guernsey"},{"countryid":"102","country":"Guinea"},{"countryid":"103","country":"Guinea-Bissau"},{"countryid":"104","country":"Guyana"},{"countryid":"105","country":"Haiti"},{"countryid":"106","country":"Heard Island and McDonald Islands"},{"countryid":"107","country":"Holy See (Vatican City)"},{"countryid":"108","country":"Honduras"},{"countryid":"109","country":"Hong Kong (SAR)"},{"countryid":"110","country":"Howland Island"},{"countryid":"111","country":"Hungary"},{"countryid":"112","country":"Iceland"},{"countryid":"113","country":"India"},{"countryid":"114","country":"Indonesia"},{"countryid":"115","country":"Iran"},{"countryid":"116","country":"Iraq"},{"countryid":"117","country":"Ireland"},{"countryid":"118","country":"Israel"},{"countryid":"119","country":"Italy"},{"countryid":"120","country":"Jamaica"},{"countryid":"121","country":"Jan Mayen"},{"countryid":"122","country":"Japan"},{"countryid":"123","country":"Jarvis Island"},{"countryid":"124","country":"Jersey"},{"countryid":"125","country":"Johnston Atoll"},{"countryid":"126","country":"Jordan"},{"countryid":"127","country":"Juan de Nova Island"},{"countryid":"128","country":"Kazakhstan"},{"countryid":"129","country":"Kenya"},{"countryid":"130","country":"Kingman Reef"},{"countryid":"131","country":"Kiribati"},{"countryid":"132","country":"Korea, North"},{"countryid":"133","country":"Korea, South"},{"countryid":"134","country":"Kuwait"},{"countryid":"135","country":"Kyrgyzstan"},{"countryid":"136","country":"Laos"},{"countryid":"137","country":"Latvia"},{"countryid":"138","country":"Lebanon"},{"countryid":"139","country":"Lesotho"},{"countryid":"140","country":"Liberia"},{"countryid":"141","country":"Libya"},{"countryid":"142","country":"Liechtenstein"},{"countryid":"143","country":"Lithuania"},{"countryid":"144","country":"Luxembourg"},{"countryid":"145","country":"Macao"},{"countryid":"146","country":"Macedonia, The Former Yugoslav Republic of"},{"countryid":"147","country":"Madagascar"},{"countryid":"148","country":"Malawi"},{"countryid":"149","country":"Malaysia"},{"countryid":"150","country":"Maldives"},{"countryid":"151","country":"Mali"},{"countryid":"152","country":"Malta"},{"countryid":"153","country":"Man, Isle of"},{"countryid":"154","country":"Marshall Islands"},{"countryid":"155","country":"Martinique"},{"countryid":"156","country":"Mauritania"},{"countryid":"157","country":"Mauritius"},{"countryid":"158","country":"Mayotte"},{"countryid":"159","country":"Mexico"},{"countryid":"160","country":"Micronesia, Federated States of"},{"countryid":"161","country":"Midway Islands"},{"countryid":"162","country":"Miscellaneous (French)"},{"countryid":"163","country":"Moldova"},{"countryid":"164","country":"Monaco"},{"countryid":"165","country":"Mongolia"},{"countryid":"166","country":"Montenegro"},{"countryid":"167","country":"Montserrat"},{"countryid":"168","country":"Morocco"},{"countryid":"169","country":"Mozambique"},{"countryid":"170","country":"Myanmar"},{"countryid":"171","country":"Namibia"},{"countryid":"172","country":"Nauru"},{"countryid":"173","country":"Navassa Island"},{"countryid":"174","country":"Nepal"},{"countryid":"175","country":"Netherlands"},{"countryid":"176","country":"Netherlands Antilles"},{"countryid":"177","country":"New Caledonia"},{"countryid":"178","country":"New Zealand"},{"countryid":"179","country":"Nicaragua"},{"countryid":"180","country":"Niger"},{"countryid":"181","country":"Nigeria"},{"countryid":"182","country":"Niue"},{"countryid":"183","country":"Norfolk Island"},{"countryid":"184","country":"Northern Mariana Islands"},{"countryid":"185","country":"Norway"},{"countryid":"186","country":"Oman"},{"countryid":"187","country":"Pakistan"},{"countryid":"188","country":"Palau"},{"countryid":"189","country":"Palmyra Atoll"},{"countryid":"190","country":"Panama"},{"countryid":"191","country":"Papua New Guinea"},{"countryid":"192","country":"Paracel Islands"},{"countryid":"193","country":"Paraguay"},{"countryid":"194","country":"Peru"},{"countryid":"195","country":"Philippines"},{"countryid":"196","country":"Pitcairn Islands"},{"countryid":"197","country":"Poland"},{"countryid":"198","country":"Portugal"},{"countryid":"199","country":"Puerto Rico"},{"countryid":"200","country":"Qatar"},{"countryid":"201","country":"Réunion"},{"countryid":"202","country":"Romania"},{"countryid":"203","country":"Russia"},{"countryid":"204","country":"Rwanda"},{"countryid":"205","country":"Saint Helena"},{"countryid":"206","country":"Saint Kitts and Nevis"},{"countryid":"207","country":"Saint Lucia"},{"countryid":"208","country":"Saint Pierre and Miquelon"},{"countryid":"209","country":"Saint Vincent and the Grenadines"},{"countryid":"210","country":"Samoa"},{"countryid":"211","country":"San Marino"},{"countryid":"212","country":"São Tomé and Príncipe"},{"countryid":"213","country":"Saudi Arabia"},{"countryid":"214","country":"Senegal"},{"countryid":"215","country":"Serbia"},{"countryid":"216","country":"Serbia and Montenegro"},{"countryid":"217","country":"Seychelles"},{"countryid":"218","country":"Sierra Leone"},{"countryid":"219","country":"Singapore"},{"countryid":"220","country":"Slovakia"},{"countryid":"221","country":"Slovenia"},{"countryid":"222","country":"Solomon Islands"},{"countryid":"223","country":"Somalia"},{"countryid":"224","country":"South Africa"},{"countryid":"225","country":"South Georgia and the South Sandwich Islands"},{"countryid":"226","country":"Spain"},{"countryid":"227","country":"Spratly Islands"},{"countryid":"228","country":"Sri Lanka"},{"countryid":"229","country":"Sudan"},{"countryid":"230","country":"Suriname"},{"countryid":"231","country":"Svalbard"},{"countryid":"232","country":"Swaziland"},{"countryid":"233","country":"Sweden"},{"countryid":"234","country":"Switzerland"},{"countryid":"235","country":"Syria"},{"countryid":"236","country":"Taiwan"},{"countryid":"237","country":"Tajikistan"},{"countryid":"238","country":"Tanzania"},{"countryid":"239","country":"Thailand"},{"countryid":"240","country":"Togo"},{"countryid":"241","country":"Tokelau"},{"countryid":"242","country":"Tonga"},{"countryid":"243","country":"Trinidad and Tobago"},{"countryid":"244","country":"Tromelin Island"},{"countryid":"245","country":"Tunisia"},{"countryid":"246","country":"Turkey"},{"countryid":"247","country":"Turkmenistan"},{"countryid":"248","country":"Turks and Caicos Islands"},{"countryid":"249","country":"Tuvalu"},{"countryid":"250","country":"Uganda"},{"countryid":"251","country":"Ukraine"},{"countryid":"252","country":"United Arab Emirates"},{"countryid":"253","country":"United Kingdom"},{"countryid":"254","country":"United States"},{"countryid":"255","country":"United States Minor Outlying Islands"},{"countryid":"256","country":"Uruguay"},{"countryid":"257","country":"Uzbekistan"},{"countryid":"258","country":"Vanuatu"},{"countryid":"259","country":"Venezuela"},{"countryid":"260","country":"Vietnam"},{"countryid":"261","country":"Virgin Islands"},{"countryid":"262","country":"Virgin Islands (UK)"},{"countryid":"263","country":"Virgin Islands (US)"},{"countryid":"264","country":"Wake Island"},{"countryid":"265","country":"Wallis and Futuna"},{"countryid":"266","country":"West Bank"},{"countryid":"267","country":"Western Sahara"},{"countryid":"268","country":"Western Samoa"},{"countryid":"269","country":"World"},{"countryid":"270","country":"Yemen"},{"countryid":"271","country":"Yugoslavia"},{"countryid":"272","country":"Zaire"},{"countryid":"273","country":"Zambia"},{"countryid":"274","country":"Zimbabwe"},{"countryid":"275","country":"Palestinian Territory, Occupied"},{"countryid":"277","country":"test"}]
     */

    private int code;
    private boolean error;
    private String message;
    private List<Data> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        /**
         * countryid : 1
         * country : Afghanistan
         */

        private String countryid;
        private String country;

        public String getCountryid() {
            return countryid;
        }

        public void setCountryid(String countryid) {
            this.countryid = countryid;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
