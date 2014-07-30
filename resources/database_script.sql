
create table kanji(
	kanji varchar(100) primary key
);

create table lecture_kanji(
	kanji varchar(100),
	lecture varchar(100)
);

create table lecture(
	lecture varchar(100) primary key
);
