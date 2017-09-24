ALTER TABLE bin ADD FOREIGN KEY(user_id) references user(id);
ALTER TABLE bin ADD FOREIGN KEY(good_id) references goods(id);
