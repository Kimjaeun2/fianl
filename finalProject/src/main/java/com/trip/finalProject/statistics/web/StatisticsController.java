package com.trip.finalProject.statistics.web;

import com.trip.finalProject.statistics.service.AttractionVO;
import com.trip.finalProject.statistics.service.StatisticsService;
import com.trip.finalProject.statistics.service.TotalDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

//오유리, 2023년 08월 : 지역관광통계페이지 관련 컨트롤러
@Controller
public class StatisticsController {

    @Autowired
    StatisticsService statisticsService;

    @Autowired
    HttpSession session;

    @GetMapping("/localTourStatistics")
    public String localTourStatistics(Model model){
    	
    	//방문자 수 최다 지역 가져오기
    	model.addAttribute("visitorRank", statisticsService.getVisitorRank());
    	
    	//관광지 검색순위 가져오기
    	model.addAttribute("attractionRank", statisticsService.getAttractionRank());

        String authority = session.getAttribute("sessionAuthority") == null ? null : session.getAttribute("sessionAuthority").toString().replaceAll(" ", "");
        if(authority != null && authority.equals("A3")) {
            model.addAttribute("isAdminLogin", true);
        } else {
            model.addAttribute("isAdminLogin", false);
        }

        return "statistics/localTourStatistics";
    }

    @GetMapping("/visitor")
    @ResponseBody
    public Map<String,Integer> getVisitorData() {
        return statisticsService.getVisitorData();
    }

    @GetMapping("/totalData")
    @ResponseBody
    public List<TotalDataVO> getTotalData(String locationName) {
        return statisticsService.getTotalData(locationName);
    }

}
