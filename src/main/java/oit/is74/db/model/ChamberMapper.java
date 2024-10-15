package oit.is74.db.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ChamberMapper {

  @Select("SELECT id,userName,chamberName from chamber where id = #{id}")
  Chamber selectById(int id);

  @Insert("INSERT INTO chamber (userName,chamberName) VALUES (#{userName},#{chamberName});")
  @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
  void insertChamber(Chamber chamber);
}
