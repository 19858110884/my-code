package student.manager.service;

import student.manager.dao.ScoreDao;
import student.manager.javebean.Score;

import java.util.List;

public class ScoreService {
    private ScoreDao scoreDao = new ScoreDao();

    public Integer addScore(String id, String courseName, int score) {
         return scoreDao.addScore(id, courseName, score);
    }

    public List<Score> queryAllScores() {
        return scoreDao.queryAllScores();
    }

    public List<Score> queryScoresWithParam(String name, String courseName) {
        return scoreDao.queryScoresWithParam(name, courseName);
    }

    public Integer deleteScoreById(Integer id) {
        return scoreDao.deleteScoreById(id);
    }

    public List<Score> queryScoresWithStudentId(String id) {

        return scoreDao.queryScoresWithStudentId(id);
    }

    public Integer deleteScoreByStudentId(String id) {
      return   scoreDao.deleteScoreByStudentId(id);
    }
}
