<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_The greatest factorial calculator     _1937cd</name>
   <tag></tag>
   <elementGuidId>90954b34-028c-475c-8d89-69fa1b926459</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        
            
                The greatest factorial calculator!
                
                    
                        
                    
                        
                
                
                    Calculate!
                
            
        
        
            
                Please enter an integer
            
        
    
    
        
            
                Terms and Conditions    Privacy
            
            
            
                © Qxf2 Services document.write(new Date().getFullYear())2021 -
                document.write(new Date().getFullYear())2021
            
        
        
    
    
        $(&quot;document&quot;).ready(function () {
            $(&quot;#getFactorial&quot;).click(function () {
                var number = $('#number').val();
                console.log(number);
                if (number != parseInt(number, 10)) {
                    $(&quot;#number&quot;).css('border', 'solid 2px red');
                    $(&quot;#resultDiv&quot;).text('Please enter an integer')
                    $(&quot;#resultDiv&quot;).css('color', 'red');
                } else {
                    $(&quot;#number&quot;).css('border', 'solid 1px #ccc');
                    var callDetails = {
                        type: 'POST',
                        url: '/factorial',
                        data: {
                            'number': number
                        }
                    };
                    $.ajax(callDetails).done(function (factorial) {
                        console.log('Hello! I am in the done part of the ajax call');
                        console.log(factorial);
                        $(&quot;#resultDiv&quot;).css('color', 'black');
                        $(&quot;#resultDiv&quot;).text('The factorial of ' + number + ' is: ' + factorial.answer);
                    });
                }
            });
        });
    


/html[1]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
