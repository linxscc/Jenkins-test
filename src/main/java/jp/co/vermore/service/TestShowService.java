package jp.co.vermore.service;

import jp.co.vermore.common.Constant;
import jp.co.vermore.common.util.DateUtil;
import jp.co.vermore.common.util.StringUtil;
import jp.co.vermore.entity.News;
import jp.co.vermore.entity.NewsDetail;
import jp.co.vermore.entity.TestShow;
import jp.co.vermore.form.admin.NewsForm;
import jp.co.vermore.form.admin.NewsListForm;
import jp.co.vermore.mapper.NewsDetailMapper;
import jp.co.vermore.mapper.NewsMapper;
import jp.co.vermore.mapper.TestShowMapper;
import jp.co.vermore.mapper.TestShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class TestShowService {

    @Autowired
    private TestShowMapper TestShowMapper;

    public TestShow getTestShowByUuid(String uuid) {
        TestShow entity = TestShowMapper.getTestShowByUuid(uuid);
        return entity;
    }

    public List<TestShow> getTestShowAll() {
        List<TestShow> TestShowList = TestShowMapper.getTestShowAll();
        return TestShowList;
    }

    public List<TestShow> getTestShowAllForTop() {
        String nowMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(0);
        String nextMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(1);
//        String now= DateUtil.dateToStringyyyy_MM_dd_HH_mm(new Date(System.currentTimeMillis()));
        List<TestShow> TestShowList = TestShowMapper.getTestShowAllForTop(nowMin,nextMin);
        return TestShowList;
    }

    public List<TestShow> getTestShowCategory(int type,int limit,int offset) {
        List<TestShow> TestShowList = TestShowMapper.getTestShowCategory(type,limit,offset);
        return TestShowList;
    }

    public List<TestShow>getTestShowPre(Date date) {
        String nowMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(0);
        String nextMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(1);
        List<TestShow> TestShow = TestShowMapper.getTestShowPre(date,nowMin,nextMin);
        return TestShow;
    }

    public List<TestShow> getTestShowNext(Date date) {
        String nowMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(0);
        String nextMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(1);
        List<TestShow> TestShow = TestShowMapper.getTestShowNext(date,nowMin,nextMin);
        return TestShow;
    }

    public List<TestShow> getTestShowAll(int type,int limit,int offset) {
        String nowMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(0);
        String nextMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(1);
        List<TestShow> TestShowList = TestShowMapper.getTestShowJsonAll(type,nowMin,nextMin,limit, offset);
        return TestShowList;
    }

    public List<TestShow> getTestShowAllByType(int type) {
        String nowMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(0);
        String nextMin= DateUtil.getTimeByMinuteYyyy_MM_ddHHmm(1);
        List<TestShow> TestShowList = TestShowMapper.getTestShowJsonAllByType(type,nowMin,nextMin);
        return TestShowList;
    }

    public TestShow getTestShowByIdAndType(long id,int type) {
        TestShow TestShow = TestShowMapper.getTestShowByIdAndType(id,type);
        return TestShow;
    }

    public List<TestShow> getTestShowEventAll(int type1,int type2,int limit,int offset) {
        String today = DateUtil.getYyyyMMdd();
        String tomorrow = DateUtil.getTomorrow();
        List<TestShow> TestShowList = TestShowMapper.getTestShowEventAll(type1,type2,tomorrow,today,limit, offset);
        return TestShowList;
    }

    private List<TestShow> convertTo(List<TestShow> demoList) {
        List<TestShow> resultList = new LinkedList<TestShow>();
        for (TestShow entity : demoList) {
            resultList.add(entity);
        }
        return resultList;
    }

    public List<TestShow> getTestSHowList(long id) {
        List<TestShow> newsList = TestShowMapper.getTestShowList(id);
        return newsList;
    }
    public String getTestShowDetail(long id) {
        String detail = newsDetailMapper.getNewsDetail(id);
        return detail;
    }
    //
    @Autowired
    private TestShowMapper addTestShowMapper;

    public long insertTestShow(NewsForm newsForm) {
        TestShow news = new TestShow();
        String uuid = "";
        int flagUuid = 0;
        int cntSelect = 0;
        while (flagUuid != 1 && cntSelect < 100){
            uuid = StringUtil.getUuid();
            if (getTestShowByUuid(uuid) == null){
                flagUuid = 1;
            }
            cntSelect++;
        }

        news.setUuid(uuid);
        String date = newsForm.getDate();
        news.setDate(DateUtil.stringToDateyyyy_MM_dd_HH_mm(date.replace("T"," ")));
        news.setTitle(newsForm.getTitle());
        news.setType(newsForm.getType());
        news.setSortScore(newsForm.getSortScore());
        news.setExcerpt(newsForm.getExcerpt());
        if(newsForm.getPublishStart() == null || "".equals(newsForm.getPublishStart())){
            news.setPublishStart(DateUtil.getDefaultDate());
        }else{
            news.setPublishStart(DateUtil.stringToDateyyyy_MM_dd_HH_mm(newsForm.getPublishStart().replace("T"," ")));
        }
        if(newsForm.getPublishEnd() == null || "".equals(newsForm.getPublishEnd())){
            news.setPublishEnd(DateUtil.getDefaultPublishEnd());
        }else{
            news.setPublishEnd(DateUtil.stringToDateyyyy_MM_dd_HH_mm(newsForm.getPublishEnd().replace("T"," ")));
        }
        news.setCreateDatetime(new Date(System.currentTimeMillis()));
        news.setUpdateDatetime(new Date(System.currentTimeMillis()));
        news.setDelFlg(Boolean.FALSE);
        news.setNote(Constant.EMPTY_STRING);
        addTestShowMapper.insertTestShow(news);
        return news.getId();
    }


    //
    @Autowired
    private NewsDetailMapper newsDetailMapper;
    public long insertDetailTestShow(NewsForm newsForm,long newsId) {
        NewsDetail newsDetail = new NewsDetail();
        newsDetail.setNewsId(newsId);
        String date = newsForm.getDate();
        newsDetail.setDate(DateUtil.stringToDateyyyy_MM_dd_HH_mm(date.replace("T"," ")));
        newsDetail.setTitle(newsForm.getTitle());
        newsDetail.setType(newsForm.getType());
        newsDetail.setDetail(newsForm.getDetail());
        newsDetail.setCreateDatetime(new Date(System.currentTimeMillis()));
        newsDetail.setDelFlg(Boolean.FALSE);
        newsDetail.setNote(Constant.EMPTY_STRING);
        newsDetailMapper.insertDetailNews(newsDetail);
        return newsDetail.getId();
    }

    public List<TestShow> getTestShowAllByCondition(NewsListForm form) {
        List<TestShow> news = TestShowMapper.getTestShowAllByCondition(form);
        return news;
    }

    public int getTestShowCountByCondition(NewsListForm form) {
        return TestShowMapper.getTestShowCountByCondition(form);
    }

    public int getTestShowCount() {
        return TestShowMapper.getTestShowCount();
    }


    public int deleteTestShow(NewsForm newsForm) {
        TestShow news = new TestShow();
        news.setId(newsForm.getId());
        news.setDelFlg(Boolean.TRUE);
        int count = TestShowMapper.deleteTestShow(news);
        System.out.println(count);
        return count;
    }

    public int deleteDetailTestShow(NewsForm newsForm) {
        NewsDetail newsDetail = new NewsDetail();
        newsDetail.setNewsId(newsForm.getId());
        newsDetail.setDelFlg(Boolean.TRUE);
        int count = newsDetailMapper.deleteDetailNews(newsDetail);
        return count;
    }


}
