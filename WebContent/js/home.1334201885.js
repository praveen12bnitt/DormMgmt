var mpq=[];mpq.push(["init","4679c24bf86b2f8aaa36879c715c36b5"]);(function(){var b,a,e,d,c;b=document.createElement("script");b.type="text/javascript";b.async=true;b.src=(document.location.protocol==="https:"?"https:":"http:")+"//api.mixpanel.com/site_media/js/api/mixpanel.js";a=document.getElementsByTagName("script")[0];a.parentNode.insertBefore(b,a);e=function(f){return function(){mpq.push([f].concat(Array.prototype.slice.call(arguments,0)))}};d=["init","track","track_links","track_forms","register","register_once","identify","name_tag","set_config"];for(c=0;c<d.length;c++){mpq[d[c]]=e(d[c])}})();

$(function () {
	//Page View
	mpq.track('Page View');
	
	//Navigation/Menu tracking
	mpq.track_links($("#nav-sign-up"), "Clicked Signup", {"linkLocation":"navigationBar"});
	mpq.track_links($("#nav-log-in"), "Clicked Log In", {"linkLocation":"navigationBar"});
	
	mpq.track_links($("#features"), "Clicked Features", {"linkLocation":"navigationBar"});
	mpq.track_links($("#tour"), "Clicked Tour", {"linkLocation":"navigationBar"});
	mpq.track_links($("#plans"), "Clicked Plans", {"linkLocation":"navigationBar"});	
	mpq.track_links($("#help"), "Clicked Help & Support", {"linkLocation":"navigationBar"});		
	
	//Registration tracking (not working right now / mixpanel issue)
	mpq.track_forms($("#registration-form"), "Submitted Registration");
	
	//Footer tracking
	mpq.track_links($("#footer-tour"), "Clicked Tour", {"linkLocation":"footer"});
	mpq.track_links($("#footer-features"), "Clicked Features", {"linkLocation":"footer"});
	mpq.track_links($("#footer-pricing"), "Clicked Pricing", {"linkLocation":"footer"});
	
	mpq.track_links($("#footer-help"), "Clicked Help", {"linkLocation":"footer"});
	mpq.track_links($("#footer-partners"), "Clicked Partners", {"linkLocation":"footer"});
	mpq.track_links($("#footer-contact"), "Clicked Contact", {"linkLocation":"footer"});
	
	mpq.track_links($("#footer-blog"), "Clicked Blog", {"linkLocation":"footer"});
	mpq.track_links($("#footer-facebook"), "Clicked Facebook", {"linkLocation":"footer"});
	mpq.track_links($("#footer-about"), "Clicked About", {"linkLocation":"footer"});
	
	mpq.track_links($("#footer-faq"), "Clicked FAQ", {"linkLocation":"footer"});
	mpq.track_links($("#footer-guide"), "Clicked Guide", {"linkLocation":"footer"});
	mpq.track_links($("#footer-widget"), "Clicked Widget", {"linkLocation":"footer"});
		
	mpq.track_links($("#footer-terms"), "Clicked Terms", {"linkLocation":"footer"});
	mpq.track_links($("#footer-privacy"), "Clicked Privacy", {"linkLocation":"footer"});
});