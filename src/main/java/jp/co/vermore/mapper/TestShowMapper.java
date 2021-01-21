package jp.co.vermore.mapper;

import jp.co.vermore.entity.TestShow;
import jp.co.vermore.form.admin.NewsListForm;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TestShowMapper {

    int insertTestShow(TestShow TestShow);

    int deleteTestShow(TestShow TestShow);

    int updateTestShow(TestShow TestShow);

    TestShow getTestShowByUuid(String uuid);

    List<TestShow> getTestShowAll();

    List<TestShow> getTestShowAllForTop( String nowMin,String nextMin);

    List<TestShow> getTestShowJsonAll(int type,String nowMin,String nextMin,int limit, int offset);

    List<TestShow> getTestShowJsonAllByType(int type,String nowMin,String nextMin);

    TestShow getTestShowByIdAndType(long id,int type);

    List<TestShow> getTestShowEventAll(int type1,int type2,String tomorrow,String today,int limit, int offset);

    List<TestShow> getTestShowList(long id);

    List<TestShow> getTestShowPre(Date date, String nowMin, String nextMin);

    List<TestShow> getTestShowNext(Date date,String nowMin,String nextMin);

    List<TestShow> getTestShowCategory(int type,int limit,int offset);

    List<TestShow> getTestShowAllByCondition(NewsListForm form);

    int getTestShowCountByCondition(NewsListForm form);

    int getTestShowCount();

    List<TestShow> getStudioTestShowList(int type, int sortScore, String tomorrow,String today);

    List<TestShow> getStudioTestShowListAll(Byte type, int limit, int offset);

    List<TestShow> getStudioTestShowALL(int type);

    List<TestShow> getStudioAllByCondition(NewsListForm form);

    int getStudioCountByCondition(NewsListForm form);

    int getStudioCount();

    TestShow getTestShowById(@Param("id") Long id);
}
