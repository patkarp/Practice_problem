import csv


class Team:

    def __init__(self, name, matches, wins, losses, draws, scored, conceded):
        self.name = name
        self.matches = matches
        self.wins = wins
        self.losses = losses
        self.draws  = draws
        self.scored = scored
        self.conceded = conceded

    
    def __str__(self):
        return f"Team: {self.name}, Played: {self.matches}, Won: {self.wins}, Lost: {self.losses}, Drawn: {self.draws}, Goals Scored: {self.scored}, Goals Conceded: {self.conceded}, Points: {self.points()}"
    
    def points(self):
        # For each match win, team gets 3 points. 1 point for each draw. No points for losses.
        wini= int(self.wins)
        drawsi=int(self.draws)
        
        result= (wini*3) + (drawsi*1)
        return result
    
    def goals(self):
        scored= int(self.scored )
        conceded=int(self.conceded)
        difference= scored-conceded
        return difference


def parse_csv_data(filepath):
    with open(filepath) as fp:
        rows = csv.reader(fp)
        teams = [Teams, *row for i, row in enumerate(rows) if i != 0]   '''The * operator, when used in a function call, is known as the unpacking operator. 
        It takes an iterable (like a list or tuple) and unpacks its elements into separate positional arguments.'''

    return teams


if __name__ == "__main__":
    teams = parse_csv_data('/Users/patkarp/Documents/Coding/Practice_problem/Python/Medium/soccer_2.csv')
    #Get the data

    # for team in teams:
    #     print(team)

    top_team = sorted(teams, reverse=True, key=lambda team: (team.points(), team.goals()))[0]
    

    #
    # maxpoints=max(teams.values())
    # topteams
    
    
    #Descending ORder

    print(f"\nTop team\n{top_team}")

    expected_team = 'Manchester United'
    assert top_team.name == expected_team, f"Expected top team is {expected_team}, found {top_team.name}"
