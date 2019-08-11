package spring.test.mybatis.infrastructure.mapper;

import org.apache.ibatis.annotations.Param;
import spring.test.mybatis.infrastructure.model.Tasks;
import spring.test.mybatis.infrastructure.model.TasksExample;

import java.util.List;

public interface TasksMapper {
    long countByExample(TasksExample example);

    int deleteByExample(TasksExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Tasks record);

    int insertSelective(Tasks record);

    List<Tasks> selectByExampleWithBLOBs(TasksExample example);

    List<Tasks> selectByExample(TasksExample example);

    List<Tasks> test();

    Tasks selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByExampleWithBLOBs(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByExample(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByPrimaryKeySelective(Tasks record);

    int updateByPrimaryKeyWithBLOBs(Tasks record);

    int updateByPrimaryKey(Tasks record);

}