import csv

class goalsorting:
    def __init__(self,name, games,wins, losses,draws,scored,conceded):
        self.name=name
        self.games=games
        self.wins = wins
        self.losses=losses
        self.draws=draws
        self.scored=scored
        self.conceded=conceded

    
    def __str__(self):
        return f"Team:{self.name} Game: {self.games} Wins: {self.wins} Losses:{self.losses} Draws:{self.draws} Scored:{self.scored} Conceded: {self.conceded} points:{self.points()}" 
        #Self.points called in lambda function uses points genereated from function score points
    
    
    def processcsv(filepath):
        teams=[]
        with open(filepath) as fp:
            rows=csv.reader(fp)
            # teams = [goalsorting(*row) for i, row in enumerate(rows) if i != 0] 
            for i, row in enumerate(rows):
                if i!=0: #Skipp first header row
                    teams.append(goalsorting(*row))

        return teams
    
    def scorepoints(self):
        wins=int(self.wins)
        draws=int(self.draws)
        result= (wins*3)+(draws*1)
        return result

    def goals(self):
        scored= int(self.scored )
        conceded=int(self.conceded)
        difference= scored-conceded
        return difference




if __name__ == "__main__":
    teams =  goalsorting.processcsv('/Users/patkarp/Documents/Coding/Practice_problem/Python/Medium/soccer_2.csv')
    for team in teams:
        print(team)

    print("Top Teams to Score are")

    topteams=sorted(teams, reverse=True, key=lambda team: (team.scorepoints(), team.goals()))
    for team in topteams:
        print(team)
    
    print("Top team is ", topteams[0])