create table Track(
id int primary key auto_increment,
name varchar(255),
price Double
);
create table Playlist(
id int primary key auto_increment,
name varchar(255)
);
create table PlaylistTrack(
playlistId int not null,
trackId int not null,
foreign key (playlistId) references Playlist(id),
foreign key (trackId) references Track(id)
);



select * from track;
select * from playlist;
select * from playlisttrack;

alter table playlisttrack
add column id int primary key auto_increment;